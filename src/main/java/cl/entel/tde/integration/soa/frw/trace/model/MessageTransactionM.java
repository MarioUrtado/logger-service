package cl.entel.tde.integration.soa.frw.trace.model;

import cl.entel.tde.integration.soa.frw.trace.domain.Conversation;
import org.joda.time.DateTime;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

public class MessageTransactionM {

    private Long id;

    private String processID;

    private String eventID;

    private String status;

    private Integer rcdStatus;

    private DateTime createDate;

    private DateTime clientRequestTimestamp;

    private DateTime messageTimeStamp;

    private Integer sequence;

    private String correlationID;

    private String sourceID;

    private String correlationEventID;

    private List<ConversationM> conversations;

    public MessageTransactionM(Long id, String processID, String eventID, String status, Integer rcdStatus, DateTime createDate, DateTime clientRequestTimestamp, DateTime messageTimeStamp, Integer sequence, String correlationID, String sourceID, String correlationEventID) {
        this.id = id;
        this.processID = processID;
        this.eventID = eventID;
        this.status = status;
        this.rcdStatus = rcdStatus;
        this.createDate = createDate;
        this.clientRequestTimestamp = clientRequestTimestamp;
        this.messageTimeStamp = messageTimeStamp;
        this.sequence = sequence;
        this.correlationID = correlationID;
        this.sourceID = sourceID;
        this.correlationEventID = correlationEventID;
        this.conversations = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRcdStatus() {
        return rcdStatus;
    }

    public void setRcdStatus(Integer rcdStatus) {
        this.rcdStatus = rcdStatus;
    }

    public DateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(DateTime createDate) {
        this.createDate = createDate;
    }

    public DateTime getClientRequestTimestamp() {
        return clientRequestTimestamp;
    }

    public void setClientRequestTimestamp(DateTime clientRequestTimestamp) {
        this.clientRequestTimestamp = clientRequestTimestamp;
    }

    public DateTime getMessageTimeStamp() {
        return messageTimeStamp;
    }

    public void setMessageTimeStamp(DateTime messageTimeStamp) {
        this.messageTimeStamp = messageTimeStamp;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getCorrelationID() {
        return correlationID;
    }

    public void setCorrelationID(String correlationID) {
        this.correlationID = correlationID;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getCorrelationEventID() {
        return correlationEventID;
    }

    public void setCorrelationEventID(String correlationEventID) {
        this.correlationEventID = correlationEventID;
    }

    public List<ConversationM> getConversations() {
        return conversations;
    }

    public void setConversations(List<ConversationM> conversations) {
        this.conversations = conversations;
    }
}
