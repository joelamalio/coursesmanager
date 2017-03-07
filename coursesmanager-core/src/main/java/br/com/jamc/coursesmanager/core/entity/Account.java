package br.com.jamc.coursesmanager.core.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@SequenceGenerator(name = "SEQ_ACCOUNT", initialValue = 1, allocationSize = 1)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ACCOUNT")
    private Long id;

    @NotBlank(message = "The name field is required.")
    private String name;

    private byte[] photo;

    @NotBlank(message = "The username field is required.")
    private String username;

    @NotBlank(message = "The password field is required.")
    private String password;

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

    @OneToMany(mappedBy = "account")
    private List<MyCourse> myCourses;

}
