package models.speciality.doctors;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DoctorsListResponseModel {
    private ArrayList<Result> result;
    private Boolean success;
    private Integer errorCode;
    private Object message;
    private Object stackTrace;
}
