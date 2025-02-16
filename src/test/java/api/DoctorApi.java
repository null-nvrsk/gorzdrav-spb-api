package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class DoctorApi {

    public Response getTimetable(Integer hospitalId, String doctorId) {
        return given()
                .log().all()
                .contentType(JSON)
                .when()
                .get("/schedule/lpu/" + hospitalId + "/doctor/" + doctorId + "/timetable")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

    public Response getAppointments(Integer hospitalId, String doctorId) {
        return given()
                .log().all()
                .contentType(JSON)
                .when()
                .get("/schedule/lpu/" + hospitalId + "/doctor/" + doctorId + "/appointments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }
}
