package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESB_SERVICE")
public class Service {

    @Id
    @Column( name = "ID")
    private Long id;

    @Column( name = "CODE")
    private String code;

    @Column( name = "NAME")
    private String name;

    @Column( name = "RCD_STATUS")
    private String rcdStatus;

    @Column( name = "CREATIONDATE")
    private String creationDate;

    public Service() {
    }

    public Service(Long id, String code, String name, String rcdStatus, String creationDate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
