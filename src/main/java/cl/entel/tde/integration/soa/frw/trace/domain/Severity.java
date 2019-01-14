package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESB_SEVERITY")
public class Severity {

    @Id
    @Column( name = "ID")
    private Long ID;

    @Column( name = "\"LEVEL\"")
    private String level;

    @Column( name = "DESCRIPTION")
    private String description;

    @Column( name = "\"ORDER\"")
    private String order;

    @Column( name = "RCD_STATUS")
    private String rcdStatus;

    @Column( name = "CREATIONDATE")
    private String creationDate;

    public Severity() {
    }

    public Severity(Long ID, String level, String description, String order, String rcdStatus, String creationDate) {
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
