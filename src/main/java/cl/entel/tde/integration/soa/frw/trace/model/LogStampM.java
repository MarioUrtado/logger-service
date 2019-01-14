package cl.entel.tde.integration.soa.frw.trace.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
        include=JsonTypeInfo.As.PROPERTY,
        property="name")
@JsonSubTypes({
        @JsonSubTypes.Type(value=LogM.class, name="LOG"),
        @JsonSubTypes.Type(value=ErrorM.class, name="ERROR"),
})
public interface LogStampM {

    public Long getID();

    public String getLogStampType();

}
