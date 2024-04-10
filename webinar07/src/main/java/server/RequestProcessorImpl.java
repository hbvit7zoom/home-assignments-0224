package server;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class RequestProcessorImpl implements RequestProcessor {

    private ObjectMapper objectMapper;
    private AuthorRepository authorRepository;

    public RequestProcessorImpl(ObjectMapper objectMapper, AuthorRepository authorRepository) {
        this.objectMapper = objectMapper;
        this.authorRepository = authorRepository;
    }

    @Override
    public void process(String method, String resource, String body, OutputStream outputStream) {
        String response;

        switch (method) {
            case "GET":
                response = doGet(resource);
                break;

            case "POST":
                response = doPost(resource, body);
                break;

            default:
                throw new UnsupportedOperationException();
        }

        try {
            outputStream.write(response.getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String doPost(String resource, String body) {

        if ("/author".equals(resource)) {
            try {
                Author author = objectMapper.readValue(body, Author.class);
                Author savedAuthor = authorRepository.save(author);

                String responseBody = objectMapper.writeValueAsString(savedAuthor);

                return new StringBuilder()
                        .append("HTTP/1.1 200 OK").append("\n")
                        .append("Content-Type: application/json").append("\n")
                        .append("Content-Length: ").append(responseBody.length()).append("\n")
                        .append("\n")
                        .append(responseBody)
                        .toString();
            } catch (JsonProcessingException e) {
                return badRequestResponse();
            }
        } else {
            return notFoundResponse();
        }
    }

    private String doGet(String resource) {

        if ("/".equals(resource)) {
            String responseBody = new StringBuilder()
                    .append("<html>").append("\n")
                    .append("<body>").append("\n")
                    .append("<h1>Hello World from Server</h1>").append("\n")
                    .append("</body>").append("\n")
                    .append("</html>").append("\n")
                    .toString();

            return new StringBuilder()
                    .append("HTTP/1.1 200 OK").append("\n")
                    .append("Content-Type: text/html").append("\n")
                    .append("Content-Length: ").append(responseBody.length()).append("\n")
                    .append("\n")
                    .append(responseBody)
                    .toString();
        } else {
            return notFoundResponse();
        }

    }

    private static String notFoundResponse() {
        return new StringBuilder()
                .append("HTTP/1.1 404 NOT FOUND").append("\n")
                .append("\n")
                .toString();
    }

    private static String badRequestResponse() {
        return new StringBuilder()
                .append("HTTP/1.1 400 BAD REQUEST").append("\n")
                .append("\n")
                .toString();
    }
}
