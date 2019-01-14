package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.Severity;
import cl.entel.tde.integration.soa.frw.trace.model.SeverityM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeverityFactory {

    @Autowired
    private DateTimeFormater dateTimeFormater;

    public SeverityFactory() {
    }

    public SeverityM build(Severity severity){
        return new SeverityM(severity.getID(), severity.getLevel(), severity.getDescription(), severity.getOrder(), severity.getRcdStatus(), dateTimeFormater.build(severity.getCreationDate()));
    }
}
