package cl.entel.tde.integration.soa.frw.trace.model;

import cl.entel.tde.integration.soa.frw.trace.domain.MessageTransaction;
import cl.entel.tde.integration.soa.frw.trace.domain.Trace;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

public class ConversationM {

    private Long id;


    private ServiceM service;

    private String conversationID;

    private Long channelID;

    private Long consumerID;

    private Integer sequence;

    private String rcdStatus;

    private DateTime creationDate;

    private List<TraceM> traces;

    public ConversationM(Long id, ServiceM service, String conversationID, Long channelID, Long consumerID, Integer sequence, String rcdStatus, DateTime creationDate, List<TraceM> traces) {
        this.id = id;
        this.service = service;
        this.conversationID = conversationID;
        this.channelID = channelID;
        this.consumerID = consumerID;
        this.sequence = sequence;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
        this.traces = traces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ServiceM getService() {
        return service;
    }

    public void setService(ServiceM service) {
        this.service = service;
    }

    public String getConversationID() {
        return conversationID;
    }

    public void setConversationID(String conversationID) {
        this.conversationID = conversationID;
    }

    public Long getChannelID() {
        return channelID;
    }

    public void setChannelID(Long channelID) {
        this.channelID = channelID;
    }

    public Long getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(Long consumerID) {
        this.consumerID = consumerID;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getRcdStatus() {
        return rcdStatus;
    }

    public void setRcdStatus(String rcdStatus) {
        this.rcdStatus = rcdStatus;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    public List<TraceM> getTraces() {
        return traces;
    }

    public void setTraces(List<TraceM> traces) {
        this.traces = traces;
    }
}
