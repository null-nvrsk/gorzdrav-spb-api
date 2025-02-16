package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static specs.GeneralSpecs.requestSpec;
import static specs.GeneralSpecs.response200Spec;

public class SpecialityApi {

    public Response getListOfSpecialties(Integer hospitalId) {
        return given(requestSpec)
                .when()
                .get("/schedule/lpu/" + hospitalId + "/specialties")
                .then()
                .spec(response200Spec)
                .extract().response();
    }

    public Response getDoctorsBySpecialty(Integer hospitalId, Integer specialtyId) {
        return given(requestSpec)
                .when()
                .get("/schedule/lpu/" + hospitalId + "/speciality/" + specialtyId + "/doctors")
                .then()
                .spec(response200Spec)
                .extract().response();
    }
}
