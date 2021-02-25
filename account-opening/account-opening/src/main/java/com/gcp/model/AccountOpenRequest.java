package com.gcp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AccountOpenRequest {

    private String name;
    private String contactNo;
    private String address;
    private  String emailId;
    private String panTanNo;

}
