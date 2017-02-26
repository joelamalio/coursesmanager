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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@SequenceGenerator(name = "SEQ_EDUCATIONAL_INSTITUTION", initialValue = 1, allocationSize = 1)
public class EducationalInstitution implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="SEQ_EDUCATIONAL_INSTITUTION")
    private Long id;

    @NotBlank(message = "The name field is required.")
    private String name;

    @OneToMany(mappedBy = "educationalInstitution")
    private List<Course> courses;

}
