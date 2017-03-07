package br.com.jamc.coursesmanager.core.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@SequenceGenerator(name = "SEQ_LESSON", initialValue = 1, allocationSize = 1)
public class Lesson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LESSON")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @NotBlank(message = "The name field is required.")
    private String name;

    @NotBlank(message = "The createdAt field is required.")
    @JsonFormat(pattern="MM/dd/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @NotBlank(message = "The updatedAt field is required.")
    @JsonFormat(pattern="MM/dd/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @JsonFormat(pattern="MM/dd/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date removedAt;

}
