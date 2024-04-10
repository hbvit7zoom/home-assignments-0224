package server;

import java.io.OutputStream;

public interface RequestProcessor {
    void process(String method, String resource, String body, OutputStream outputStream);
}
