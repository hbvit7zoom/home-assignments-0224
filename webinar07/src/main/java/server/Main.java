package server;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        AuthorRepository authorRepository = new AuthorRepository();

        RequestProcessor requestProcessor = new RequestProcessorImpl(objectMapper, authorRepository);

        MyServer myServer = new MyServer(requestProcessor);
        myServer.start();
    }
}
