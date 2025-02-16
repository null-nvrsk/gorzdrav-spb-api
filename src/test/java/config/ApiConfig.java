package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${env}.properties",
        "classpath:config/local.properties"
})
public interface ApiConfig extends Config {

    @Key("api.baseURI")
    String getBaseURI();

    @Key("api.basePath")
    String getBasePath();
}

