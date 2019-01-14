package cl.entel.tde.integration.soa.frw.trace.repository;

import cl.entel.tde.integration.soa.frw.trace.domain.Conversation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends CrudRepository<Conversation, Long> {

    public Conversation findByConversationID(String conversatioID);

}
