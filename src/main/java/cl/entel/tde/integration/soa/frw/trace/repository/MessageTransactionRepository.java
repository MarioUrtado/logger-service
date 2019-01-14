package cl.entel.tde.integration.soa.frw.trace.repository;

import cl.entel.tde.integration.soa.frw.trace.domain.MessageTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageTransactionRepository extends CrudRepository<MessageTransaction, Long> {

    public List<MessageTransaction> findByEventID(String eventID);

    public List<MessageTransaction> findByEventIDAndProcessID(String eventID, String processID);

}
