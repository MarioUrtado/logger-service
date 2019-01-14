package cl.entel.tde.integration.soa.frw.trace.model;

import org.joda.time.DateTime;

public class SeverityM {

    private Long ID;

    private String level;

    private String description;

    private String order;

    private String rcdStatus;

    private DateTime creationDate;

    public SeverityM(Long ID, String level, String description, String order, String rcdStatus, DateTime creationDate) {
        this.ID = ID;
        this.level = level;
        this.description = description;
        this.order = order;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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
