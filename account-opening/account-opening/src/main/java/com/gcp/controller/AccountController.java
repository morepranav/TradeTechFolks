package com.gcp.controller;

import com.gcp.entity.AccountEntity;
import com.gcp.model.AccountOpenRequest;
import com.gcp.model.AccountOpenResponse;
import com.gcp.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/tradeTech")
public class AccountController {

    @Autowired
    AccountService service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(path = "/accountOpen")
    @ResponseBody
    public ResponseEntity<AccountOpenResponse> createAccount(AccountOpenRequest request) {
        AccountEntity entity =  service.updateAccount(request);
// convert entity to DTO
        AccountOpenResponse response = modelMapper.map(entity, AccountOpenResponse.class);
        return new ResponseEntity<AccountOpenResponse>(response, HttpStatus.CREATED);
       /* return new ResponseEntity<String>("Account Open Successfully For Name-Sushil Heda, Contact-8983243133 and Pan Card-A1234",
                HttpStatus.OK);
*/    }
}
