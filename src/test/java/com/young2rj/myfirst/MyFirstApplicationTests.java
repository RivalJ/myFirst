package com.young2rj.myfirst;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyFirstApplicationTests{

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() {
        System.out.println("port: " + port);
    }

}
