package com.example.student_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
@RestController
public class NotesConsumer {
    @Autowired
    RestTemplate restTemplate;
    String url = "http://localhost:8989";

    @RequestMapping("/studentGetNotes")
    public String studentGetNotes(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        url+="/getNotes/113";
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
    }

}
