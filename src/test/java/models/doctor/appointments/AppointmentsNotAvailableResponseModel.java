package models.doctor.appointments;

import lombok.Data;

@Data
public class AppointmentsNotAvailableResponseModel {
    private Boolean success;
    private Integer errorCode;
    private String message;
    private String requestId;
}
