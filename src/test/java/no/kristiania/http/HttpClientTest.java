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
    void shouldReturn404StatusCode() throws IOException {
        HttpClient httpClient = new HttpClient("urlecho.appspot.com", 80, "/echo?status=200");
        assertEquals(404, httpClient.getResponseCode());
    }
}
