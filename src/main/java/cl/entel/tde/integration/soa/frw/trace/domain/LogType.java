package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESB_LOG_TYPE")
public class LogType {

    @Id
    @Column(name = "ID")
    private Long ID;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "RCD_STATUS")
    private String rcdStatus;
    @Column(name = "CREATIONDATE")
    private String creationDate;

    public LogType() {
    }

    public LogType(Long ID, String name, String description, String rcdStatus, String creationDate) {
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
