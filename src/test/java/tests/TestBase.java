package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static config.ConfigProvider.apiConfig;

public class TestBase {
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = apiConfig.getBaseURI();
        RestAssured.basePath = apiConfig.getBasePath();
    }
}