package tests;

import api.DoctorApi;
import io.restassured.response.Response;
import models.doctor.appointments.AppointmentsNotAvailableResponseModel;
import models.doctor.appointments.AppointmentsResponseModel;
import models.doctor.timetable.DoctorTimetableResponseModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Проверка расписания врачей")
public class DoctorTests extends TestBase {

    private final DoctorApi doctorApi = new DoctorApi();

    int hospitalId = 1174; // СПб ГБУЗ "Городская поликлиника №100 Невского района Санкт-Петербурга" Поликлиническое отделение №12
    String doctorId = "п100.136"; // Врач "Абаева Р.О. 3 ТО 25/27 участки"
    String busyDoctorId = "п100.154";

    @Test
    @DisplayName("Получить расписание врача")
    void successDoctorTimetableTest() {
        Response response = doctorApi.getTimetable(hospitalId, doctorId);
        DoctorTimetableResponseModel doctorTimetable = response.as(DoctorTimetableResponseModel.class);

        assertThat(doctorTimetable.getResult()).isNotEmpty();
        assertThat(doctorTimetable.getSuccess()).isTrue();
        assertThat(doctorTimetable.getErrorCode()).isEqualTo(0);
    }

    @Test
    @DisplayName("Проверить доступные талоны")
    void successDoctorAppointmentsTest() {
        Response response = doctorApi.getAppointments(hospitalId, doctorId);
        AppointmentsResponseModel doctorAppointments = response.as(AppointmentsResponseModel.class);

        assertThat(doctorAppointments.getResult()).isNotEmpty();
        assertThat(doctorAppointments.getSuccess()).isTrue();
        assertThat(doctorAppointments.getErrorCode()).isEqualTo(0);
    }

    @Test
    @DisplayName("Проверить врача, у которого нет свободных талонов")
    void doctorWithoutAppointmentsTest() {
        int errorCode = 39;
        String errorMessage = "В медицинской организации закончились свободные талоны для записи к выбранному врачу. " +
                "Попробуйте записаться позже или обратитесь в регистратуру медицинской организации";

        Response response = doctorApi.getAppointments(hospitalId, busyDoctorId);
        AppointmentsNotAvailableResponseModel doctorNoAppointments =
                response.as(AppointmentsNotAvailableResponseModel.class);

        assertThat(doctorNoAppointments.getSuccess()).isFalse();
        assertThat(doctorNoAppointments.getErrorCode()).isEqualTo(errorCode);
        assertThat(doctorNoAppointments.getMessage()).isEqualTo(errorMessage);
    }
}
