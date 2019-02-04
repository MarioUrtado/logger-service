package cl.entel.tde.integration.soa.frw.trace.repository;

import cl.entel.tde.integration.soa.frw.trace.domain.MessageTransaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageTransactionRepository extends CrudRepository<MessageTransaction, Long> {

    @Query("SELECT distinct(mt) FROM MessageTransaction mt JOIN mt.conversations c WHERE mt.eventID like ?1 AND (mt.processID like ?2 or mt.processID is null)  and c.conversationID like ?3")
    public List<MessageTransaction> find(String eventID, String processID, String conversationID);

}
