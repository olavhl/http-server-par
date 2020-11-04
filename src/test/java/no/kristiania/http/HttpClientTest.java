package no.kristiania.http;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {
    @Test
    void shouldReturnSuccessfulStatusCode() throws IOException {
        HttpClient httpClient = new HttpClient("urlecho.appspot.com", 80, "/echo?status=200");
        assertEquals(200, httpClient.getResponseCode());
    }

    @Test
    void shouldReturn401StatusCode() throws IOException {
        HttpClient httpClient = new HttpClient("urlecho.appspot.com", 80, "/echo?status=401");
        assertEquals(401, httpClient.getResponseCode());
    }
}
