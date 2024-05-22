package ru.sberbank.jd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sberbank.jd.service.ClientService;
import ru.sberbank.jd.service.ClientServiceImpl;
import ru.sberbank.jd._dev.ClientServiceStubImpl;
import ru.sberbank.jd.service.ServiceA;

@Slf4j
@Configuration
@EnableConfigurationProperties(value = AppProperties.class)
public class AppConfig {

    @Value("${app.param1}")
    private String param1;

    // Бины создаются в порядке, указанном в коде
    //    @Profile("dev")
    //    @Bean
    //    @ConditionalOnProperty(name = "app.client-service.stub-mode", havingValue = "true")
    //    public ClientService clientServiceStubImpl() {
    //        return new ClientServiceStubImpl();
    //    }

    //    @Primary
    //    @Profile("!dev")
    @Bean
    @ConditionalOnMissingBean
    public ClientService clientServiceImpl(ServiceA a) {
        log.info("param1 = {}", param1);
        return new ClientServiceImpl(a);
    }

    @Configuration
    @ConditionalOnProperty(name = "app.client-service.stub-mode", havingValue = "true")
    static public class StubConfiguration {

        @Bean
        public ClientService clientServiceStubImpl() {
            return new ClientServiceStubImpl();
        }
    }
}
