package br.com.jamc.coursesmanager.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.Entity;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.OneToMany;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
public class EducationalInstitution implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "The name field is required.")
    private String name;

    @OneToMany(mappedBy = "educationalInstitution")
    private List<Course> courses;

}
