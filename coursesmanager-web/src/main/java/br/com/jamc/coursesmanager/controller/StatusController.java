package br.com.jamc.coursesmanager.controller;

import br.com.jamc.coursesmanager.core.entity.Status;
import br.com.jamc.coursesmanager.core.service.StatusService;
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
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping(value = "")
    public List<Status> findAll() {
        return statusService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Status get(@PathVariable Long id) {
        return statusService.findById(id);
    }

    @PostMapping(value = "")
    public void create(@RequestBody Status status) {
    }

    @PutMapping(value = "")
    public void update(@RequestBody Status status) {
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
    }

}