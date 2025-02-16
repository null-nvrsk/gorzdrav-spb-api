package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class SpecialityApi {

    public Response getListOfSpecialties(Integer hospitalId) {
        return given()
                .log().all()
                .contentType(JSON)
                .when()
                .get("schedule/lpu/" + hospitalId + "/specialties")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

    public Response getDoctorsBySpecialty(Integer hospitalId, Integer specialtyId) {
        return given()
                .log().all()
                .contentType(JSON)
                .when()
                .get("schedule/lpu/" + hospitalId + "/speciality/" + specialtyId + "/doctors")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }



}
