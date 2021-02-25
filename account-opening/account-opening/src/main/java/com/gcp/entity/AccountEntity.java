package com.gcp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table (name="USER_ACCOUNT")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="account_number")
    private Long acctNo;

    @Column (name ="name")
    private String name;

    @Column (name ="contact")
    private String contactNo;

    @Column (name ="address")
    private String address;

    @Column (name ="pan_tan_no")
    private String panTanNo;

    @Column (name ="email_id")
    private String emailId;
}
