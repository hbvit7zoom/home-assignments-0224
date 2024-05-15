package ru.sberbank.jd;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sberbank.jd.service.ClientService;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class App 
{

    ClientService clientService;

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
    }
}
