package br.com.jamc.coursesmanager.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.Entity;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@SequenceGenerator(name = "SEQ_PROFILE", initialValue = 1, allocationSize = 1)
public class Profile implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROFILE")
	private Long id;

	@NotBlank(message = "The name field is required.")
	private String name;

	private byte[] photo;

	@NotBlank(message = "The username field is required.")
	private String userName;

	@NotBlank(message = "The password field is required.")
	private String password;

	@OneToMany(mappedBy = "profile")
	private List<Course> courses;

}
