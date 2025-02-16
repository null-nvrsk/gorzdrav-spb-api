package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Проверка специализаций врачей")
public class SpecialityTests extends TestBase {

    @Test
    @DisplayName("Список специализаций врачей в клинике")
    void listOfSpecialtiesTest() {
//        GET https://gorzdrav.spb.ru/_api/api/v2/schedule/lpu/1174/specialties

    }

    @Test
    @DisplayName("Список врачей одной специализации в клинике")
    void listOfDoctorsBySpecialtyTest() {
//        GET https://gorzdrav.spb.ru/_api/api/v2/schedule/lpu/1174/specialties

    }
}
