package cl.entel.tde.integration.soa.frw.trace.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Inheritance;

@Inheritance
@DiscriminatorColumn(name="logStampType")
public interface LogStamp {

    public Long getID();

    public String getLogStampType();

}
