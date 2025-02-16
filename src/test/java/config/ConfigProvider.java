package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {

    public static final ApiConfig apiConfig = ConfigFactory
            .create(ApiConfig.class, System.getProperties());
}