package br.com.jamc.coursesmanager.core.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.GeneratedValue;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "The name field is required.")
    private String name;

}
