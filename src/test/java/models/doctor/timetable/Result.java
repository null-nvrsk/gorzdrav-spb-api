package models.doctor.timetable;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Result {
    public ArrayList<Appointment> appointments;
    public Object denyCause;
    public Boolean recordableDay;
    public Date visitStart;
    public Date visitEnd;
}
