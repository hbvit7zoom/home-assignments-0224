package ru.sberbank.jd;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import ru.sberbank.jd.config.AppProperties;
import ru.sberbank.jd.service.ClientService;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class App 
{

    ClientService clientService;
    AppProperties props;
    private Environment environment;

//    public App(
//            @Qualifier(value = "clientServiceImpl") ClientService clientService) {
//        this.clientService = clientService;
//    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void execute() {
        clientService.getClient();
        log.info("AppProperties.clientService.url={}", props.getClientService().getUrl());
        environment.getProperty("app.param1");
    }
}
