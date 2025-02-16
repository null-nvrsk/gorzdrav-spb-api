package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Проверка расписания врачей")
public class DoctorTimetableTests extends TestBase {

    @Test
    @DisplayName("Получить расписание врача")
    void successDoctorTimetableTest() {
//        https://gorzdrav.spb.ru/_api/api/v2/schedule/lpu/1174/doctor/%D0%BF100.136/timetable

    }

    @Test
    @DisplayName("Проверить врача, у которого нет приемных дней")
    void doctorWithoutVisitingHoursTimetableTest() {
//        https://gorzdrav.spb.ru/_api/api/v2/schedule/lpu/255/doctor/%D0%B462.129/timetable

    }
}
