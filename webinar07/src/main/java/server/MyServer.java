package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    private RequestProcessor requestProcessor;

    public MyServer(RequestProcessor requestProcessor) {
        this.requestProcessor = requestProcessor;
    }

    public void start() {

        try ( ServerSocket serverSocket = new ServerSocket(8080)){

            while (true) {
                Socket socket = serverSocket.accept();

                InputStream inputStream = socket.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(inputStream);

                String startLine = dataInputStream.readLine();
                if (startLine == null) {
                    continue;
                }
                System.out.println(startLine);

                String[] s = startLine.split(" ");
                String method = s[0];
                String resource = s[1];

                String line;
                while (!(line = dataInputStream.readLine()).isEmpty()) {
                    System.out.println(line);
                }

                StringBuilder bodyBuilder = new StringBuilder();
                while (dataInputStream.available() != 0) {
                    line = dataInputStream.readLine();
                    bodyBuilder.append(line);
                    System.out.println(line);
                }

                String body = bodyBuilder.toString();

                OutputStream outputStream = socket.getOutputStream();

                Thread thread = new Thread(() -> {
                    requestProcessor.process(method, resource, body, outputStream);
                });
                thread.start();

                System.out.println();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
