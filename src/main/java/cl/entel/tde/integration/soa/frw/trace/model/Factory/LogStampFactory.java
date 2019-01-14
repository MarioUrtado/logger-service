package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.Error;
import cl.entel.tde.integration.soa.frw.trace.domain.Log;
import cl.entel.tde.integration.soa.frw.trace.domain.LogStamp;
import cl.entel.tde.integration.soa.frw.trace.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogStampFactory {

    @Autowired
    private DateTimeFormater dateTimeFormater;

    @Autowired
    private SeverityFactory severityFactory;

    @Autowired
    private LogTypeFactory logTypeFactory;

    public LogStampFactory() {
    }

    public LogStampM build(LogStamp logStamp){
        if(logStamp.getLogStampType().equals("ERROR")){
            return build((Error) logStamp);
        }
        if(logStamp.getLogStampType().equals("LOG")){
            return build((Log) logStamp);
        }
        return null;
    }

    public ErrorM build(Error error){
        ErrorM errorM = new ErrorM(error.getID(), error.getStatusID(), error.getDescription(), error.getCanonicalErrorID(), error.getRawFault(), error.getRawCode(), error.getRawDescription(), error.getErrorSource(), error.getErrorSourceDetails(), error.getModule(), error.getSubModule(), error.getRcdStatus(), dateTimeFormater.build(error.getCreationDate()));
        return errorM;
    }

    public LogM build(Log log){
        return new LogM(log.getID(), log.getMessage(), logTypeFactory.build(log.getType()) , severityFactory.build(log.getSeverity()), log.getDescription() ,log.getRcdStatus(), dateTimeFormater.build(log.getCreationDate()));
    }

}

