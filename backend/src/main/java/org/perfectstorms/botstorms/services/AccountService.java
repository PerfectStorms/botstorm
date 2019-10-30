package org.perfectstorms.botstorms.services;

import org.perfectstorms.botstorms.entities.AccountEntity;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<AccountEntity> getAll();
    Optional<AccountEntity> getOneById(Long id);
    void addAccount(String accountEmail, String accountPhone, String accountLogin, String accountPassword);
    void deleteAccountById(Long id);
}
