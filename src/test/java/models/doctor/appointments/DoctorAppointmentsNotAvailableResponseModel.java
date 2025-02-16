package models.doctor.appointments;

import lombok.Data;

@Data
public class DoctorAppointmentsNotAvailableResponseModel {
    private Boolean success;
    private Integer errorCode;
    private String message;
    private String requestId;
}
