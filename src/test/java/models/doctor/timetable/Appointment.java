package models.doctor.timetable;

import lombok.Data;

import java.util.Date;

@Data
public class Appointment {
    private String id;
    private Date visitStart;
    private Date visitEnd;
    private String address;
    private Object number;
    private String room;
}
