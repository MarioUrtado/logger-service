package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.LogType;
import cl.entel.tde.integration.soa.frw.trace.model.LogTypeM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogTypeFactory {

    @Autowired
    private DateTimeFormater dateTimeFormater;

    public LogTypeFactory() {
    }

    public LogTypeM build(LogType logType){
        return new LogTypeM(logType.getID(), logType.getName(),logType.getDescription(), logType.getRcdStatus(), dateTimeFormater.build(logType.getCreationDate()));
    }
}
