package guru.springframework.sfgdi.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Getter
@ConstructorBinding
@ConfigurationProperties("guru")
@AllArgsConstructor
public class SfgConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcurl;

}
