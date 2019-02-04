package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name = "MessageTransaction")
@Table(name = "ESB_MESSAGE_TRANSACTION")
public class MessageTransaction {

    @Id
    private Long id;

    @Column(name = "PROC_ID")
    private String processID;

    @Column(name = "EVENT_ID")
    private String eventID;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "RCD_STATUS")
    private Integer rcdStatus;

    @Column(name = "CREATIONDATE")
    private String createDate;

    @Column(name = "CLIENT_REQ_TIMESTAMP")
    private String clientRequestTimestamp;

    @Column(name = "MSG_TIMESTAMP")
    private String messageTimeStamp;

    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "CORRELATION_ID")
    private String correlationID;

    @Column(name = "SOURCE_ID")
    private String sourceID;

    @Column(name = "CORRELATION_EVENT_ID")
    private String correlationEventID;

    @OneToMany(mappedBy = "messageTransaction")
    private List<Conversation> conversations;

    public MessageTransaction() {
    }

    public MessageTransaction(Long id, String processID, String eventID, String status, Integer rcdStatus, String createDate, String clientRequestTimestamp, String messageTimeStamp, Integer sequence, String correlationID, String sourceID, String correlationEventID) {
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getClientRequestTimestamp() {
        return clientRequestTimestamp;
    }

    public void setClientRequestTimestamp(String clientRequestTimestamp) {
        this.clientRequestTimestamp = clientRequestTimestamp;
    }

    public String getMessageTimeStamp() {
        return messageTimeStamp;
    }

    public void setMessageTimeStamp(String messageTimeStamp) {
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

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }
}
