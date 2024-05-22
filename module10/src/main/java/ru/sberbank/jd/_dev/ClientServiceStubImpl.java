package ru.sberbank.jd._dev;

import lombok.extern.slf4j.Slf4j;
import ru.sberbank.jd.service.ClientService;

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
