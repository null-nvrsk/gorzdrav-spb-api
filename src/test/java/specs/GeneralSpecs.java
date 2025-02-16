package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class GeneralSpecs {

    public static RequestSpecification requestSpec = with()
            .filter(withCustomTemplates())
            .log().method()
            .log().uri()
            .contentType(JSON);

    public static ResponseSpecification response200Spec = new ResponseSpecBuilder()
            .log(LogDetail.BODY)
            .expectStatusCode(200)
            .build();
}