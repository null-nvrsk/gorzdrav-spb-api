package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class DistrictApi {

    public Response getListOfHospitals(Integer districtId) {
        return given()
                .log().all()
                .contentType(JSON)
                .when()
                .get("/shared/district/" + districtId + "/lpus")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

}
