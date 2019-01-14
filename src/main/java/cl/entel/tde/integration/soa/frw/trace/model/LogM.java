package cl.entel.tde.integration.soa.frw.trace.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.joda.time.DateTime;

@JsonTypeName("LOG")
public class LogM  implements LogStampM{

    private Long ID;

    private String message;

    private LogTypeM type;

    private SeverityM severity;

    private String description;

    private String rcdStatus;

    private DateTime creationDate;

    public LogM(Long ID, String message, LogTypeM type, SeverityM severity, String description, String rcdStatus, DateTime creationDate) {
        this.ID = ID;
        this.message = message;
        this.type = type;
        this.severity = severity;
        this.description = description;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
    }

    @Override
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

    public LogTypeM getType() {
        return type;
    }

    public void setType(LogTypeM type) {
        this.type = type;
    }

    public SeverityM getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityM severity) {
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

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String getLogStampType() {
        return "LOG";
    }
}
