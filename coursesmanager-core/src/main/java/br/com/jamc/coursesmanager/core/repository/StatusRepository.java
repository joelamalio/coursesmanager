package br.com.jamc.coursesmanager.core.repository;

import br.com.jamc.coursesmanager.core.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
