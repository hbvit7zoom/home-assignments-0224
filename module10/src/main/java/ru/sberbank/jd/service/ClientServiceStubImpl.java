package ru.sberbank.jd.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class ClientServiceStubImpl implements ClientService {
//    private final static Logger log = LoggerFactory.getLogger(ClientServiceStubImpl.class);
    @Override
    public String getClient() {
        log.info("ClientServiceStubImpl");
        return "";
    }

    @Override
    public String createClient(String id, String name) {
        return "";
    }
}
