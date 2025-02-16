package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Проверка талонов")
public class DoctorAppointmentsTests extends TestBase {

    @Test
    @DisplayName("Проверить доступные талоны")
    void successDoctorAppointmentsTest() {
//        https://gorzdrav.spb.ru/_api/api/v2/schedule/lpu/1174/doctor/%D0%BF100.136/appointments

    }

    @Test
    @DisplayName("Проверить врача, у которого нет свободных талонов")
    void doctorWithoutVisitingHoursTimetableTest() {
//        https://gorzdrav.spb.ru/_api/api/v2/schedule/lpu/1174/doctor/%D0%BF100.553/appointments

    }
}
