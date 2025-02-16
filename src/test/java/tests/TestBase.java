package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static config.ConfigProvider.apiConfig;

public class TestBase {
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = apiConfig.getBaseURI();
        RestAssured.basePath = apiConfig.getBasePath();
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
