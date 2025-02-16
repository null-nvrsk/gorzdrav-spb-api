package models.district.single;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DistrictResponseModel {
    private ArrayList<Result> result;
    private Boolean success;
    private Integer errorCode;
    private Object message;
    private Object stackTrace;
}
