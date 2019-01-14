package cl.entel.tde.integration.soa.frw.trace.service;

import cl.entel.tde.integration.soa.frw.trace.domain.Conversation;
import cl.entel.tde.integration.soa.frw.trace.model.ConversationM;
import cl.entel.tde.integration.soa.frw.trace.model.Factory.ConversationFactory;
import cl.entel.tde.integration.soa.frw.trace.model.Factory.MessasgeTransactionFactory;
import cl.entel.tde.integration.soa.frw.trace.model.MessageTransactionM;
import cl.entel.tde.integration.soa.frw.trace.repository.ConversationRepository;
import cl.entel.tde.integration.soa.frw.trace.repository.MessageTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ConversationService {

    @Autowired
    private MessageTransactionRepository messageTransactionRepository;

    @Autowired
    private ConversationRepository conversationRepository;

    @Autowired
    private ConversationFactory conversationFactory;

    @Autowired
    private MessasgeTransactionFactory messasgeTransactionFactory;

    public ConversationService() {
    }

    @Transactional
    public MessageTransactionM findByConversationID(String conversationID){
        Conversation conversation = conversationRepository.findByConversationID(conversationID);
        MessageTransactionM messageTransactionM = messasgeTransactionFactory.build(conversation.getMessageTransaction(), false);
        ConversationM conversationM = conversationFactory.build(conversation, false);
        messageTransactionM.getConversations().add(conversationM);
        return messageTransactionM;
    }

}