package cl.entel.tde.integration.soa.frw.trace.model;

import org.joda.time.DateTime;

public class LogTypeM {

    private Long ID;

    private String name;

    private String description;

    private String rcdStatus;

    private DateTime creationDate;

    public LogTypeM(Long ID, String name, String description, String rcdStatus, DateTime creationDate) {
        this.ID = ID;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
