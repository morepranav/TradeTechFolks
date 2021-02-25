package com.gcp.service;

import com.gcp.entity.AccountEntity;
import com.gcp.model.AccountOpenRequest;
import com.gcp.repository.AccountRespository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRespository repo;

    @Autowired
    private ModelMapper modelMapper;

    public AccountEntity updateAccount(AccountOpenRequest request){
        AccountEntity entity = modelMapper.map(request, AccountEntity.class);
        return repo.save(entity);

    }

}
