package net.nordryd.nordmodapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NordModApiApplicationTests
{
    @Test
    void contextLoads() {
    }

    @Test
    public void testApiRoot() {
        assertEquals("Hello, world!", new NordModApiApplication().apiRoot());
    }
}
