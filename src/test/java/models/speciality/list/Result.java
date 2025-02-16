package models.speciality.list;

import lombok.Data;

import java.util.Date;

@Data
public class Result {
    public String id;
    public String ferId;
    public String name;
    public Integer countFreeParticipant;
    public Integer countFreeTicket;
    public Date lastDate;
    public Date nearestDate;
}
