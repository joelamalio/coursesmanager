package br.com.jamc.coursesmanager.core.service;

import br.com.jamc.coursesmanager.core.entity.EducationalInstitution;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jamc.coursesmanager.core.repository.EducationalInstitutionRepository;

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

}
