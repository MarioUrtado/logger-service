package cl.entel.tde.integration.soa.frw.trace.model;

import org.joda.time.DateTime;

public class ServiceM {

    private Long id;

    private String code;

    private String name;

    private String rcdStatus;

    private CapabilityM capability;

    private DateTime creationDate;

    public ServiceM(Long id, String code, String name, String rcdStatus, DateTime creationDate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
    }

    public ServiceM(Long id, String code, String name, String rcdStatus, DateTime creationDate, CapabilityM capability) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
        this.capability = capability;
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

    public CapabilityM getCapability() {
        return capability;
    }

    public void setCapability(CapabilityM capability) {
        this.capability = capability;
    }
}


