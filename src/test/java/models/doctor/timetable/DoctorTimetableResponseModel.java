package models.doctor.timetable;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DoctorTimetableResponseModel {
    private ArrayList<Result> result;
    private Boolean success;
    private Integer errorCode;
    private Object message;
    private Object stackTrace;
}
