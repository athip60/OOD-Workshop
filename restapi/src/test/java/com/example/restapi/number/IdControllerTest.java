package com.example.restapi.number;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class IdControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private Random stubRandom;

    @Test
    void generateId() {
        // Arrange
        when(stubRandom.nextInt(anyInt())).thenReturn(7);
        // Act
        DataResponse result
                = restTemplate.getForObject("/id", DataResponse.class);
        // Assert
        assertEquals("XYZ7", result.getId());
    }
}