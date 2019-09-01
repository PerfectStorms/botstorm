package org.perfectstorms.society.controllers;

import org.perfectstorms.society.entities.Account;
import org.perfectstorms.society.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/account/{id}")
    public Optional<Account> getOneById(@PathVariable Long id) {
        return accountRepository.findById(id);
    }

    @PostMapping(value = "/accounts")
    public ResponseEntity addAccount(@RequestBody Account account) {
        accountRepository.save(account);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/accounts")
    public ResponseEntity deleteAccountById(Long id) {
        accountRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
