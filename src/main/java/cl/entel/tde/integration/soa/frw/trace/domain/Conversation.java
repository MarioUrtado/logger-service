package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Conversation")
@Table(name = "ESB_CONVERSATION")
public class Conversation{

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MESSAGE_TX_ID")
    private MessageTransaction messageTransaction;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CAPABILITY_ID")
    private Capability capability;

    @Column(name = "CONVERSATION_ID")
    private String conversationID;

    @Column(name = "CHANNEL_ID")
    private Long channelID;

    @Column(name = "CONSUMER_ID")
    private Long consumerID;

    private int sequence;

    @Column(name = "RCD_STATUS")
    private String rcdStatus;

    @Column(name = "CREATIONDATE")
    private String creationDate;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONV_ID")
    private List<Trace> traces;

    public Conversation() {
        this.traces = new ArrayList<>();
    }

    public Conversation(Long id, MessageTransaction messageTransactionID, Long capabilityID, String conversationID, Long channelID, Long consumerID, int sequence, String rcdStatus, String creationDate) {
        this.id = id;
        this.messageTransaction = messageTransactionID;
        this.capability = capability;
        this.conversationID = conversationID;
        this.channelID = channelID;
        this.consumerID = consumerID;
        this.sequence = sequence;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
        this.traces = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getRcdStatus() {
        return rcdStatus;
    }

    public void setRcdStatus(String rcdStatus) {
        this.rcdStatus = rcdStatus;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public MessageTransaction getMessageTransaction() {
        return messageTransaction;
    }

    public void setMessageTransaction(MessageTransaction messageTransaction) {
        this.messageTransaction = messageTransaction;
    }

    public List<Trace> getTraces() {
        return traces;
    }

    public void setTraces(List<Trace> traces) {
        this.traces = traces;
    }

    public Capability getCapability() {
        return capability;
    }

    public void setCapability(Capability capability) {
        this.capability = capability;
    }
}
