package br.com.jamc.coursesmanager.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamc.coursesmanager.core.entity.EducationalInstitution;

public interface EducationalInstitutionRepository extends JpaRepository<EducationalInstitution, Long> {

    //public List<EducationalInstitution> findByName(String name);

}
