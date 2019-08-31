package org.perfectstorms.society.controllers;

import org.perfectstorms.society.entities.Account;
import org.perfectstorms.society.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {

    private AccountRepository accountRepository;

    @Autowired
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public Optional<Account> getOneById(@PathVariable Long id) {
        return accountRepository.findById(id);
    }
}
