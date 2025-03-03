package models.speciality.doctors;

import lombok.Data;

import java.util.Date;

@Data
public class Result {
    private String ariaNumber;
    private Object ariaType;
    private String comment;
    private Integer freeParticipantCount;
    private Integer freeTicketCount;
    private String id;
    private Date lastDate;
    private String name;
    private String lastName;
    private String firstName;
    private String middleName;
    private Date nearestDate;
}