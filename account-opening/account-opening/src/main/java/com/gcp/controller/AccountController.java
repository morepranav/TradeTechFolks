package com.gcp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AccountController {

    @PostMapping(path="/accountOpen")
    @ResponseBody
    public ResponseEntity<String> generateAccount(){
        return new ResponseEntity<String>("Account Open Successfully For Name-Sushil Heda, Contact-8983243133 and Pan Card-A1234",
                HttpStatus.OK);
    }
}
