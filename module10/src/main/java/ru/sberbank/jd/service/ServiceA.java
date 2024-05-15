package ru.sberbank.jd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
//@Profile("!dev")
public class ServiceA {
    private final ServiceB serviceB;

//    public ServiceA(ServiceB serviceB) {
//        this.serviceB = serviceB;
//    }

    public String doA() {
        return "A";
    }
}
