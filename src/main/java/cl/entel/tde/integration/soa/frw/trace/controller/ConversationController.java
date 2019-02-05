package cl.entel.tde.integration.soa.frw.trace.controller;

import cl.entel.tde.integration.soa.frw.trace.model.MessageTransactionM;
import cl.entel.tde.integration.soa.frw.trace.service.ConversationService;
import cl.entel.tde.integration.soa.frw.trace.service.MessageTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/logger")
@CrossOrigin(origins = "http://localhost:3000")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @Autowired
    private MessageTransactionService messageTransactionService;

    @RequestMapping(value = "/transaction/conversation", method = RequestMethod.GET, produces = "application/json")
    public MessageTransactionM findByConversation(@RequestParam(value = "conversationID") String conversationID){
        MessageTransactionM messageTransactionM = conversationService.findByConversationID(conversationID);
        return messageTransactionM;
    }

    @RequestMapping(value = "/transaction", method = RequestMethod.GET, produces = "application/json")
    public List<MessageTransactionM> findByEventID(@RequestParam(value = "eventID", required = false, defaultValue = "*") String eventID, @RequestParam(value = "processID", required = false, defaultValue = "*") String processID, @RequestParam(value = "conversationID", required = false, defaultValue = "*") String conversationID){
        List<MessageTransactionM> messageTransactionM = messageTransactionService.find(eventID,processID, conversationID);
        return messageTransactionM;
    }


}
