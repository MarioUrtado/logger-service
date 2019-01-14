package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.*;

@Entity
@Table(name = "ESB_CAPABILITY")
public class Capability {

    @Id
    @Column( name= "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name= "SERVICE_ID")
    private Service service;

    @Column( name= "CODE")
    private String code;

    @Column( name= "NAME")
    private String name;

    @Column( name= "RCD_STATUS")
    private String rcdStatus;

    @Column( name= "CREATIONDATE")
    private String creationDate;

    public Capability() {
    }

    public Capability(Long id, Service service, String code, String name, String rcdStatus, String creationDate) {
        this.id = id;
        this.service = service;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
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
