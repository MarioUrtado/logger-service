package cl.entel.tde.integration.soa.frw.trace.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.joda.time.DateTime;

import javax.persistence.Id;

@JsonTypeName("ERROR")
public class ErrorM  implements LogStampM{

    private Long ID;

    private Long statusID;

    private String description;

    private Long canonicalErrorID;

    private String rawFault;

    private String rawCode;

    private String rawDescription;

    private Long errorSource;

    private String errorSourceDetails;

    private String module;

    private String subModule;

    private String rcdStatus;

    private DateTime creationDate;

    public ErrorM(Long ID, Long statusID, String description, Long canonicalErrorID, String rawFault, String rawCode, String rawDescription, Long errorSource, String errorSourceDetails, String module, String subModule, String rcdStatus, DateTime creationDate) {
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

    @Id
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

    public DateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(DateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String getLogStampType() {
        return "ERROR";
    }
}
