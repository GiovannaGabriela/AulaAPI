package com.aos.aula.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIService {
    private final String url="https://pokeapi.co/api/v2/pokemon/ditto";
    @Autowired
    private RestTemplate restTemplate;

    public String getAllData(){
        return restTemplate.getForObject(this.url, String.class);
    }
}