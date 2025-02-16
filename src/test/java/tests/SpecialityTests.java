package tests;

import api.SpecialityApi;
import io.restassured.response.Response;
import models.speciality.doctors.DoctorsListResponseModel;
import models.speciality.list.SpecialtyListResponseModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Проверка специализаций врачей")
public class SpecialityTests extends TestBase {

    private final SpecialityApi specialityApi = new SpecialityApi();

    int hospitalId = 1174; // СПб ГБУЗ "Городская поликлиника №100 Невского района Санкт-Петербурга" Поликлиническое отделение №12
    int specialityId = 4; // Терапевт участковый

    @Test
    @DisplayName("Список специализаций в клинике")
    void listOfSpecialtiesTest() {
        Response response = specialityApi.getListOfSpecialties(hospitalId);
        SpecialtyListResponseModel specialtyList = response.as(SpecialtyListResponseModel.class);

        assertThat(specialtyList.getResult()).isNotEmpty();
        assertThat(specialtyList.getSuccess()).isTrue();
        assertThat(specialtyList.getErrorCode()).isEqualTo(0);
    }

    @Test
    @DisplayName("Список врачей одной специализации в клинике")
    void listOfDoctorsBySpecialtyTest() {
        Response response = specialityApi.getDoctorsBySpecialty(hospitalId, specialityId);
        DoctorsListResponseModel doctorsList = response.as(DoctorsListResponseModel.class);

        assertThat(doctorsList.getResult()).isNotEmpty();
        assertThat(doctorsList.getSuccess()).isTrue();
        assertThat(doctorsList.getErrorCode()).isEqualTo(0);

    }
}
