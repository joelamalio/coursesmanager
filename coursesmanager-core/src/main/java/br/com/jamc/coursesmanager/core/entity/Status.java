package br.com.jamc.coursesmanager.core.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@Table(name = "STATUS")
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

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

}
