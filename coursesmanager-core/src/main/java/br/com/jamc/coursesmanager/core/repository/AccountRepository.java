package br.com.jamc.coursesmanager.core.repository;

import br.com.jamc.coursesmanager.core.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
