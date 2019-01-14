package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.Capability;
import cl.entel.tde.integration.soa.frw.trace.model.CapabilityM;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CapabilityFactory {

    @Autowired
    public DateTimeFormater dateTimeFormater;

    public CapabilityFactory() {
    }

    public CapabilityM build(Capability capability){
        CapabilityM capabilityM = new CapabilityM(capability.getId(), capability.getCode(), capability.getName(), capability.getRcdStatus(), dateTimeFormater.build(capability.getCreationDate()));
        return capabilityM;
    }
}
