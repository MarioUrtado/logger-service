package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.*;

@Entity
@Table(name = "ESB_ERROR")
public class Error{

    @Id
    @Column(name = "ID")
    private Long ID;

    @Column(name = "STATUS_ID")
    private Long statusID;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CAN_ERR_ID")
    private Long canonicalErrorID;

    @Column(name = "RAW_FAULT")
    private String rawFault;

    @Column(name = "RAW_CODE")
    private String rawCode;

    @Column(name = "RAW_DESCRIPTION")
    private String rawDescription;

    @Column(name = "ERROR_SOURCE")
    private Long errorSource;

    @Column(name = "ERROR_SOURCE_DETAILS")
    private String errorSourceDetails;

    @Column(name = "MODULE")
    private String module;

    @Column(name = "SUB_MODULE")
    private String subModule;

    @Column(name = "RCD_STATUS")
    private String rcdStatus;

    @Column(name = "CREATIONDATE")
    private String creationDate;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRACE_ID")
    private Trace trace;

    public Error() {
    }

    public Error(Long ID, Long statusID, String description, Long canonicalErrorID, String rawFault, String rawCode, String rawDescription, Long errorSource, String errorSourceDetails, String module, String subModule, String rcdStatus, String creationDate) {
        this.ID = ID;
        this.statusID = statusID;
        this.description = description;
        this.canonicalErrorID = canonicalErrorID;
        this.rawFault = rawFault;
        this.rawCode = rawCode;
        this.rawDescription = rawDescription;
        this.errorSource = errorSource;
        this.errorSourceDetails = errorSourceDetails;
        this.module = module;
        this.subModule = subModule;
        this.rcdStatus = rcdStatus;
        this.creationDate = creationDate;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getStatusID() {
        return statusID;
    }

    public void setStatusID(Long statusID) {
        this.statusID = statusID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCanonicalErrorID() {
        return canonicalErrorID;
    }

    public void setCanonicalErrorID(Long canonicalErrorID) {
        this.canonicalErrorID = canonicalErrorID;
    }

    public String getRawFault() {
        return rawFault;
    }

    public void setRawFault(String rawFault) {
        this.rawFault = rawFault;
    }

    public String getRawCode() {
        return rawCode;
    }

    public void setRawCode(String rawCode) {
        this.rawCode = rawCode;
    }

    public String getRawDescription() {
        return rawDescription;
    }

    public void setRawDescription(String rawDescription) {
        this.rawDescription = rawDescription;
    }

    public Long getErrorSource() {
        return errorSource;
    }

    public void setErrorSource(Long errorSource) {
        this.errorSource = errorSource;
    }

    public String getErrorSourceDetails() {
        return errorSourceDetails;
    }

    public void setErrorSourceDetails(String errorSourceDetails) {
        this.errorSourceDetails = errorSourceDetails;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getSubModule() {
        return subModule;
    }

    public void setSubModule(String subModule) {
        this.subModule = subModule;
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
        return "ERR";
    }

    public Trace getTrace() {
        return trace;
    }

    public void setTrace(Trace trace) {
        this.trace = trace;
    }
}
