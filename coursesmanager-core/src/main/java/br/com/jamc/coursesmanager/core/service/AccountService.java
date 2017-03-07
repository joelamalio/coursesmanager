package br.com.jamc.coursesmanager.core.service;

import br.com.jamc.coursesmanager.core.entity.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jamc.coursesmanager.core.repository.AccountRepository;

/**
 *
 * @author joelamalio
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findById(Long id) {
        return accountRepository.findOne(id);
    }

}
