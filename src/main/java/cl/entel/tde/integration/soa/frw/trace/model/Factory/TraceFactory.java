package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.Trace;
import cl.entel.tde.integration.soa.frw.trace.model.LogStampM;
import cl.entel.tde.integration.soa.frw.trace.model.TraceM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TraceFactory {

    @Autowired
    private DateTimeFormater dateTimeFormater;

    @Autowired
    private LogStampFactory logStampFactory;

    public TraceFactory() {
    }

    public TraceM build(Trace trace){
        LogStampM log = null;
        if (!trace.getLog().isEmpty()){
            log = logStampFactory.build(trace.getLog().get(0));
        }
        return new TraceM(trace.getId(),trace.getSequence(), trace.getComponent(), trace.getOperation(), dateTimeFormater.build(trace.getLogTimestamp()), trace.getLogPlaceholder(), trace.getRcdStatus(), dateTimeFormater.build(trace.getCreationDate()), log);
    }
}
