package cl.entel.tde.integration.soa.frw.trace.model;

import cl.entel.tde.integration.soa.frw.trace.model.Factory.DateTimeFormater;
import org.joda.time.DateTime;

import java.util.List;

public class TraceM {

    private Long id;
    //private String conversationID;
    private Integer sequence;

    private String component;

    private String operation;

    private DateTime logTimestamp;

    private String logPlaceholder;

    private String rcdStatus;

    private DateTime creationDate;

    private LogStampM log;

    public TraceM(Long id, Integer sequence, String component, String operation, DateTime logTimestamp, String logPlaceholder, String rcdStatus, DateTime creationDate, LogStampM log) {
        this.id = id;
        this.sequence = sequence;
        this.component = component;
        this.operation = operation;
        this.logTimestamp = logTimestamp;
        this.logPlaceholder = logPlaceholder;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
        this.log = log;
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

    public DateTime getLogTimestamp() {
        return logTimestamp;
    }

    public void setLogTimestamp(DateTime logTimestamp) {
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

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LogStampM getLog() {
        return log;
    }

    public void setLog(LogStampM log) {
        this.log = log;
    }
}
