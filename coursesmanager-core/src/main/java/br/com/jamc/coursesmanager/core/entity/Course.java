package br.com.jamc.coursesmanager.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "educational_institution_id")
    private EducationalInstitution educationalInstitution;

    @NotBlank(message = "The name field is required.")
    private String name;

    @NotBlank(message = "The description field is required.")
    private String description;

    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

}
