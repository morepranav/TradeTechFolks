package com.gcp.repository;

import com.gcp.entity.AccountEntity;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRespository  extends JpaRepository <AccountEntity, Long>{
}
