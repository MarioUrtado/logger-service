package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.*;

@Entity
@Table(name = "ESB_LOG")
@DiscriminatorValue("LOG")
public class Log  {

    @Id
    @Column(name = "ID")
    private Long ID;

    @Column(name = "MESSAGE")
    private String message;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="TYPE_ID")
    private LogType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="SEVERITY_ID")
    private Severity severity;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RCD_STATUS")
    private String rcdStatus;

    @Column(name = "CREATIONDATE")
    private String creationDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRACE_ID")
    private Trace trace;

    public Log() {
    }

    public Log(Long ID, String message, LogType type, Severity severity, String description, String rcdStatus, String creationDate) {
        this.ID = ID;
        this.message = message;
        this.type = type;
        this.severity = severity;
        this.description = description;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogType getType() {
        return type;
    }

    public void setType(LogType type) {
        this.type = type;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getLogStampType() {
        return "LOG";
    }

    public Trace getTrace() {
        return trace;
    }

    public void setTrace(Trace trace) {
        this.trace = trace;
    }
}
