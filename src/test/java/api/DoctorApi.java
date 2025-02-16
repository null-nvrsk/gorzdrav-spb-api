package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static specs.GeneralSpecs.requestSpec;
import static specs.GeneralSpecs.response200Spec;

public class DoctorApi {

    public Response getTimetable(Integer hospitalId, String doctorId) {
        return given(requestSpec)
                .when()
                .get("/schedule/lpu/" + hospitalId + "/doctor/" + doctorId + "/timetable")
                .then()
                .spec(response200Spec)
                .extract().response();
    }

    public Response getAppointments(Integer hospitalId, String doctorId) {
        return given(requestSpec)
                .when()
                .get("/schedule/lpu/" + hospitalId + "/doctor/" + doctorId + "/appointments")
                .then()
                .spec(response200Spec)
                .extract().response();
    }
}
