package com.example.restapi.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    private final String url;
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    public UserGateway(@Value("${api_url}") String url) {
        this.url = url;
    }

    public UserResponse getUserById(int id) {
        UserResponse user
                = restTemplate.getForObject(url, UserResponse.class);
        return user;
    }

}