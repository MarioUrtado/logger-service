package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.Capability;
import cl.entel.tde.integration.soa.frw.trace.domain.Service;
import cl.entel.tde.integration.soa.frw.trace.model.CapabilityM;
import cl.entel.tde.integration.soa.frw.trace.model.ServiceM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {

    @Autowired
    public DateTimeFormater dateTimeFormater;

    @Autowired
    private CapabilityFactory capabilityFactory;

    public ServiceM build(Service service){
        ServiceM serviceM = new ServiceM(service.getId(), service.getCode(),service.getName(),service.getRcdStatus(),dateTimeFormater.build(service.getCreationDate()));
        return serviceM;
    }

    public ServiceM buildReverse(Capability capability){
        CapabilityM capabilityM = capabilityFactory.build(capability);
        Service service = capability.getService();
        ServiceM serviceM = new ServiceM(service.getId(), service.getCode(),service.getName(),service.getRcdStatus(),dateTimeFormater.build(service.getCreationDate()), capabilityM);
        return serviceM;
    }
}
