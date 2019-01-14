package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.Conversation;
import cl.entel.tde.integration.soa.frw.trace.model.ConversationM;
import cl.entel.tde.integration.soa.frw.trace.model.MessageTransactionM;
import cl.entel.tde.integration.soa.frw.trace.model.TraceM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ConversationFactory {

    @Autowired
    private DateTimeFormater dateTimeFormater;

    @Autowired
    private MessasgeTransactionFactory messasgeTransactionFactory;

    @Autowired
    private TraceFactory traceFactory;

    @Autowired
    private ServiceFactory serviceFactory;

    public ConversationFactory() {
    }

    public ConversationM build(Conversation conversation, boolean reverse){
        List<TraceM> traces = conversation.getTraces().stream().map(trace -> traceFactory.build(trace)).collect(Collectors.toList());
        ConversationM conversationM = new ConversationM(conversation.getId(), serviceFactory.buildReverse(conversation.getCapability()), conversation.getConversationID(), conversation.getChannelID(), conversation.getConsumerID(), conversation.getSequence(), conversation.getRcdStatus(), dateTimeFormater.build(conversation.getCreationDate()), traces);
        return conversationM;
    }

}
