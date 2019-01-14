package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import cl.entel.tde.integration.soa.frw.trace.domain.MessageTransaction;
import cl.entel.tde.integration.soa.frw.trace.model.ConversationM;
import cl.entel.tde.integration.soa.frw.trace.model.MessageTransactionM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MessasgeTransactionFactory {

    @Autowired
    private DateTimeFormater dateTimeFormater;

    @Autowired
    private ConversationFactory conversationFactory;

    public MessasgeTransactionFactory() {
    }

    public MessageTransactionM build(MessageTransaction messageTransaction, boolean deep){
        MessageTransactionM messageTransactionM = new MessageTransactionM(messageTransaction.getId(), messageTransaction.getProcessID(), messageTransaction.getEventID(), messageTransaction.getStatus(), messageTransaction.getRcdStatus(), dateTimeFormater.build(messageTransaction.getCreateDate()), dateTimeFormater.build(messageTransaction.getClientRequestTimestamp()), dateTimeFormater.build(messageTransaction.getMessageTimeStamp()), messageTransaction.getSequence(), messageTransaction.getCorrelationID(), messageTransaction.getSourceID(), messageTransaction.getCorrelationEventID());
        if(deep){
            List<ConversationM> conversations = messageTransaction.getConversations().stream().map(x-> conversationFactory.build(x, false)).collect(Collectors.toList());
            messageTransactionM.setConversations(conversations);
        }
        return messageTransactionM;
    }

}
