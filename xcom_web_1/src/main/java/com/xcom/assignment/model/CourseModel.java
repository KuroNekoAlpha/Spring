package com.xcom.assignment.model;

import java.util.List;

import com.xcom.assignment.domain.Course;

public interface CourseModel {
	List<Course> getAll();
	void save(Course c);

}
