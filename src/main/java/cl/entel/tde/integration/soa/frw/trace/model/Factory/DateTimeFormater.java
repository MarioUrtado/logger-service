package cl.entel.tde.integration.soa.frw.trace.model.Factory;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class DateTimeFormater {


    public DateTimeFormater() {
    }

    public DateTime build (String creationDate){

        if (!creationDate.contains(".")) {
            creationDate = creationDate + ".";
        }
        creationDate  = creationDate + "0000";
        String miliseconds = creationDate.split("\\.")[1];
        miliseconds = miliseconds.substring(0,4);
        creationDate = creationDate.split("\\.")[0]+"."+miliseconds;

        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSSS");
        return dtf.parseDateTime(creationDate);
    }

}
