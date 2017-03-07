package br.com.jamc.coursesmanager.controller;

import br.com.jamc.coursesmanager.core.entity.EducationalInstitution;
import br.com.jamc.coursesmanager.core.service.EducationalInstitutionService;
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
@RequestMapping("/educational-institution")
public class EducationalInstitutionController {

    @Autowired
    private EducationalInstitutionService educationalInstitutionService;

    @GetMapping(value = "")
    public List<EducationalInstitution> findAll() {
        return educationalInstitutionService.findAll();
    }

    @GetMapping(value = "/{id}")
    public EducationalInstitution get(@PathVariable Long id) {
        return educationalInstitutionService.findById(id);
    }

    @PostMapping(value = "")
    public void create(@RequestBody EducationalInstitution educationalInstitution) {
    }

    @PutMapping(value = "")
    public void update(@RequestBody EducationalInstitution educationalInstitution) {
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
    }

}
