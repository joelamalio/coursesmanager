package br.com.jamc.coursesmanager.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamc.coursesmanager.core.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
