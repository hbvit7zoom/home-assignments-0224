package ru.sberbank.jd.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import ru.sberbank.jd.service.ClientService;
import ru.sberbank.jd.service.ClientServiceImpl;
import ru.sberbank.jd.service.ClientServiceStubImpl;
import ru.sberbank.jd.service.ServiceA;

@Slf4j
@Configuration
public class AppConfig {

    @Value("${app.param1}")
    private String param1;

//    @Primary
    @Profile("!dev")
    @Bean
    public ClientService clientServiceImpl(ServiceA a) {
        log.info("param1 = {}", param1);
        return new ClientServiceImpl(a);
    }

    @Profile("dev")
    @Bean
    public ClientService clientServiceStubImpl() {
        return new ClientServiceStubImpl();
    }


}
