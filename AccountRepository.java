package com.example.wap.repositories;

import com.example.wap.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository
        extends CrudRepository<Account, Integer> {
}
