package cl.entel.tde.integration.soa.frw.trace.domain;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ESB_TRACE")
public class Trace {

    @Id
    private Long id;
    //private String conversationID;
    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "COMPONENT")
    private String component;

    @Column(name = "OPERATION")
    private String operation;

    @Column(name = "LOG_TIMESTAMP")
    private String logTimestamp;

    @Column(name = "LOG_PLACEHOLDER")
    private String logPlaceholder;

    @Column(name = "RCD_STATUS")
    private String rcdStatus;

    @Column(name = "CREATIONDATE")
    private String creationDate;

    @OneToMany(mappedBy = "trace")
    private List<Log> log;
    @OneToMany(mappedBy = "trace")
    private List<Error> error;

    public Trace() {
    }

    public Trace(Long id, Integer sequence, String component, String operation, String logTimestamp, String logPlaceholder, String rcdStatus, String creationDate) {
        this.id = id;
        this.sequence = sequence;
        this.component = component;
        this.operation = operation;
        this.logTimestamp = logTimestamp;
        this.logPlaceholder = logPlaceholder;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
        this.error = new ArrayList<>();
        this.log = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getLogTimestamp() {
        return logTimestamp;
    }

    public void setLogTimestamp(String logTimestamp) {
        this.logTimestamp = logTimestamp;
    }

    public String getLogPlaceholder() {
        return logPlaceholder;
    }

    public void setLogPlaceholder(String logPlaceholder) {
        this.logPlaceholder = logPlaceholder;
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

    public List<Log> getLog() {
        return log;
    }

    public void setLog(List<Log> log) {
        this.log = log;
    }

    public List<Error> getError() {
        return error;
    }

    public void setError(List<Error> error) {
        this.error = error;
    }
}
