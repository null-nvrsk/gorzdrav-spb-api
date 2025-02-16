package models.doctor.appointments;

import lombok.Data;

import java.util.ArrayList;

@Data
public class AppointmentsResponseModel {
    private ArrayList<Result> result;
    private Boolean success;
    private Integer errorCode;
    private Object message;
    private Object stackTrace;
}
