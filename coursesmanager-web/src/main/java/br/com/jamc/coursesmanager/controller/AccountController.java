package br.com.jamc.coursesmanager.controller;

import br.com.jamc.coursesmanager.core.entity.Account;
import br.com.jamc.coursesmanager.core.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joelamalio
 */
@RestController
@CrossOrigin
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "")
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Account get(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @PostMapping(value = "")
    public void create(@RequestBody Account account) {
    }

    @PutMapping(value = "")
    public void update(@RequestBody Account account) {
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
    }

}
