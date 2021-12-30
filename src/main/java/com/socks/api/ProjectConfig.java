package com.socks.api;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.*;

@Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {

    String env();

    @Key("{env}.baseUrl")
    String baseUrl();

    @Key("{env}.locale")
    @DefaultValue("de")
    String locale();

    @Key("{env}.logging")
    boolean logging();
}
