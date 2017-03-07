package br.com.jamc.coursesmanager.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamc.coursesmanager.core.entity.EducationalInstitution;
import java.util.List;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EducationalInstitutionRepository extends JpaRepository<EducationalInstitution, Long>, JpaSpecificationExecutor<EducationalInstitution> {

    public List<EducationalInstitution> findByName(String name);

}
