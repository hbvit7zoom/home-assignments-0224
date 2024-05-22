package ru.sberbank.jd.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppProperties {
    private String param1;
    private String value;
    private ClientServiceProperties clientService;

    @Getter
    @Setter
    static public class ClientServiceProperties {
        private String url;
        private String stubMode;
    }
}
