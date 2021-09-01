package guru.springframework.sfgdi.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@ConfigurationProperties("guru")
@Data
@Configuration
public class SfgConfiguration {
    private String username;
    private String password;
    private String jdbcurl;
}
