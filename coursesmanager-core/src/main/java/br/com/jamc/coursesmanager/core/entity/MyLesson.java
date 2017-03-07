package br.com.jamc.coursesmanager.core.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@SequenceGenerator(name = "SEQ_MY_LESSON", initialValue = 1, allocationSize = 1)
public class MyLesson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MY_LESSON")
    private Long id;

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

    @NotBlank(message = "The course field is required.")
    @ManyToOne
    @JoinColumn(name = "my_course_id")
    private MyCourse myCourse;

    @NotBlank(message = "The status field is required.")
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
