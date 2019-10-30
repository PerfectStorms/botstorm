package org.perfectstorms.botstorms.controllers;

import org.perfectstorms.botstorms.entities.AccountEntity;
import org.perfectstorms.botstorms.repositories.AccountRepository;
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
    public List<AccountEntity> getAll() {
        return accountRepository.findAll();
    }

    @GetMapping(value = "/account/{id}")
    public Optional<AccountEntity> getOneById(@PathVariable Long id) {
        return accountRepository.findById(id);
    }

    @PostMapping(value = "/accounts")
    public ResponseEntity addAccount(@RequestBody AccountEntity accountEntity) {
        accountRepository.save(accountEntity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/accounts")
    public ResponseEntity deleteAccountById(Long id) {
        accountRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
