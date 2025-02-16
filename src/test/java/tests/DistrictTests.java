package tests;

import api.DistrictApi;
import io.restassured.response.Response;
import models.district.DistrictResponseModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Проверка списков лечебных заведений по районам")
public class DistrictTests extends TestBase {

    private final DistrictApi districtApi = new DistrictApi();

    @DisplayName("Получить список лечебных заведений")
    @CsvSource({
            "12, Невский",
            "1, Адмиралтейский",
            "18, Центральный"
    })
    @ParameterizedTest(name = "в районе \"{1}\" (id = {0})")
    void listOfHospitalsByDistrictTest(int districtId, String districtName) {
        Response response = districtApi.getListOfHospitals(districtId);
        DistrictResponseModel district = response.as(DistrictResponseModel.class);

        assertThat(district.getSuccess()).isTrue();
        assertThat(district.getErrorCode()).isEqualTo(0);

        assertThat(district.getResult())
                .allMatch(item -> item.getDistrict() == districtId);
        assertThat(district.getResult())
                .allMatch(item -> item.getDistrictId() == districtId);
        assertThat(district.getResult())
                .allMatch(item -> item.getDistrictName().equals(districtName));
    }

    @DisplayName("Проверить запрос за пределами границ списка")
    @ValueSource(strings = {
            "0", "19"
    })
    @ParameterizedTest(name = "Несуществующий район (id = {0})")
    void outOfRangeDistrictTest(int districtId) {
        Response response = districtApi.getListOfHospitals(districtId);
        DistrictResponseModel district = response.as(DistrictResponseModel.class);

        assertThat(district.getResult()).isEmpty();
        assertThat(district.getSuccess()).isTrue();
        assertThat(district.getErrorCode()).isEqualTo(0);
    }
}
