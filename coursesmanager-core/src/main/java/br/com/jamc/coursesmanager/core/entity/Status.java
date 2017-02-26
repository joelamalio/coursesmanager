package br.com.jamc.coursesmanager.core.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 *
 * @author joelamalio
 */
@Data
@Entity
@Table(name="STATUS")
@SequenceGenerator(name = "SEQ_STATUS", initialValue = 1, allocationSize = 1)
public class Status implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STATUS")
	private Long id;

	@NotBlank(message = "The name field is required.")
	private String name;

}
