package cl.entel.tde.integration.soa.frw.trace.model;

import cl.entel.tde.integration.soa.frw.trace.domain.Service;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CapabilityM {

    private Long id;

    private String code;

    private String name;

    private String rcdStatus;

    private DateTime creationDate;

    public CapabilityM(Long id,  String code, String name, String rcdStatus, DateTime creationDate) {
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

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }
}
