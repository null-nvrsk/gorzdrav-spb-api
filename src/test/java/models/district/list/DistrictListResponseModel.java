package models.district.list;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DistrictListResponseModel {
    public ArrayList<Result> result;
    public Boolean success;
    public Integer errorCode;
    public Object message;
    public Object stackTrace;
}
