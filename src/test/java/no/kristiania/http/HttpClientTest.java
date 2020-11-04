package no.kristiania.http;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpClientTest {

    @Test
    void shouldReturnSuccessfulStatusCode() throws IOException {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo?status=200");
        assertEquals(200, client.getResponseCode());
    }

    @Test
    void shouldReturn404StatusCode() throws IOException {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo?status=404");
        assertEquals(404, client.getResponseCode());
    }


}
