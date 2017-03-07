package br.com.jamc.coursesmanager.core.service;

import br.com.jamc.coursesmanager.core.entity.EducationalInstitution;
import br.com.jamc.coursesmanager.core.filter.EducationalInstitutionFilter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jamc.coursesmanager.core.repository.EducationalInstitutionRepository;
import br.com.jamc.coursesmanager.core.repository.specification.EducationalInstitutionSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author joelamalio
 */
@Service
public class EducationalInstitutionService {

    @Autowired
    private EducationalInstitutionRepository educationalInstitutionRepository;

    public List<EducationalInstitution> findAll() {
        return educationalInstitutionRepository.findAll();
    }

    public EducationalInstitution findById(Long id) {
        return educationalInstitutionRepository.findOne(id);
    }

    public Page<EducationalInstitution> findByFilter(EducationalInstitutionFilter filter, Pageable pageable) {
        return educationalInstitutionRepository.findAll(EducationalInstitutionSpecification.findByFilter(filter), pageable);
    }
}
