package models.speciality.list;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SpecialtyListResponseModel {
    private ArrayList<Result> result;
    private Boolean success;
    private Integer errorCode;
    private Object message;
    private Object stackTrace;
}
