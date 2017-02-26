package br.com.jamc.coursesmanager.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamc.coursesmanager.core.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	public List<Course> findByName();

}