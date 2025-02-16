package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static specs.GeneralSpecs.requestSpec;
import static specs.GeneralSpecs.response200Spec;

public class DistrictApi {

    public Response getListOfHospitals(Integer districtId) {
        return given(requestSpec)
                .when()
                .get("/shared/district/" + districtId + "/lpus")
                .then()
                .spec(response200Spec)
                .extract().response();
    }

    public Response getListOfDistricts() {
        return given(requestSpec)
                .when()
                .get("/shared/districts")
                .then()
                .spec(response200Spec)
                .extract().response();
    }
}
