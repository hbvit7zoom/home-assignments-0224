package ru.sberbank.jd.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private ServiceA aService;

    @Override
    public String getClient() {
        log.info("ClientServiceImpl and serviceA = {}", aService.doA());
        return "";
    }

    @Override
    public String createClient(String id, String name) {
        return "";
    }
}
