package cl.entel.tde.integration.soa.frw.trace.service;

import cl.entel.tde.integration.soa.frw.trace.domain.MessageTransaction;
import cl.entel.tde.integration.soa.frw.trace.model.Factory.MessasgeTransactionFactory;
import cl.entel.tde.integration.soa.frw.trace.model.MessageTransactionM;
import cl.entel.tde.integration.soa.frw.trace.repository.MessageTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageTransactionService {

    @Autowired
    private MessageTransactionRepository messageTransactionRepository;


    @Autowired
    private MessasgeTransactionFactory messasgeTransactionFactory;

    public MessageTransactionService() {
    }

    public List<MessageTransactionM> find(String eventID, String processID, String conversationID){
        eventID = eventID.replace("*", "%");
        processID = processID.replace("*", "%");
        conversationID = conversationID.replace("*", "%");
        List<MessageTransaction> messageTransaction = messageTransactionRepository.find(eventID, processID, conversationID);
        System.out.print(messageTransaction .size());
        List<MessageTransactionM> messageTransactionM = messageTransaction.stream().map( x -> messasgeTransactionFactory.build(x, true)).collect(Collectors.toList());
        return messageTransactionM;
    }
}
