package com.example.restapi.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public UserResponse getUserById(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/1";
        UserResponse user
                = restTemplate.getForObject(url, UserResponse.class);
        return user;
    }

}