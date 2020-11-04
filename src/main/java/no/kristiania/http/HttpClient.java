package no.kristiania.http;

import java.io.IOException;
import java.net.Socket;

public class HttpClient {


    public HttpClient(String hostname, int port, String requestTarget) throws IOException {
        Socket socket = new Socket(hostname, port);

        String request = "GET " + requestTarget + " HTTP/1.1\r\n" +
                "Host: " + hostname + "\r\n\r\n";

        socket.getOutputStream().write(request.getBytes());


        StringBuilder line = new StringBuilder();
        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            if (c == '\n') {
                break;
            }
            line.append((char)c);
        }
        System.out.println(line);
    }

    public static void main(String[] args) throws IOException {
       String hostname = "urlecho.appspot.com";
       String requestTarget = "/echo?status=200&body=HelloWorld";
       int port = 80;

       new HttpClient(hostname, port, requestTarget);
    }

}
