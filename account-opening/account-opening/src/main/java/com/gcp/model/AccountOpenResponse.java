package com.gcp.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AccountOpenResponse {

    private Long acctNo;
    private String name;
    private String contactNo;
    private String address;
    private  String emailId;
    private String panTanNo;

}
