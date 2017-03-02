package br.com.jamc.coursesmanager.core.service;

import br.com.jamc.coursesmanager.core.entity.Status;
import br.com.jamc.coursesmanager.core.repository.StatusRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joelamalio
 */
@Service
public class StatusService {
    
    @Autowired
    private StatusRepository statusRepository;

    public List<Status> findAll() {
        return statusRepository.findAll();
    }
    
    public Status findById(Long id) {
        return statusRepository.findOne(id);
    }

}
