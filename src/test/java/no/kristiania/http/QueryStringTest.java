package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueryStringTest {

    @Test
    public void shouldRetrieveParameter() {
        QueryString queryString = new QueryString("status=200");
        assertEquals("200", queryString.getParameter("status"));
    }


    @Test
    public void shouldRetrieveMultipleParameters() {
        QueryString queryString = new QueryString("status=404&body=HelloThere");
        assertEquals("404", queryString.getParameter("status"));
        assertEquals("HelloThere", queryString.getParameter("body"));
    }
}