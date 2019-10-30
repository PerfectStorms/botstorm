package org.perfectstorms.botstorms.services.impl;

import org.perfectstorms.botstorms.entities.AccountEntity;
import org.perfectstorms.botstorms.repositories.AccountRepository;
import org.perfectstorms.botstorms.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<AccountEntity> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<AccountEntity> getOneById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public void addAccount(String accountEmail, String accountPhone, String accountLogin, String accountPassword) {

    }

    @Override
    public void deleteAccountById(Long id) {

    }
}
