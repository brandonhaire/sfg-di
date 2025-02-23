package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

// @ConstructorBinding  //not needed after Spring Boot 3.0
@ConfigurationProperties("guru")
public class SfgConstructorConfig {
    private final String username;
    private final String password;
    private final String jdbcurl;

    public SfgConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getJdbcurl() {
        return this.jdbcurl;
    }

}
