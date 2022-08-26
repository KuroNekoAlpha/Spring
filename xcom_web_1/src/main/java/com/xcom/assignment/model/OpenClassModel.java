/**
 * 
 */
package com.xcom.assignment.model;

import java.util.List;

import com.xcom.assignment.domain.OpenClass;

/**
 * @author OAK SOE KHANT
 *
 */
public interface OpenClassModel {
	
	List<OpenClass> findByCourse(int courseId);
	void create(OpenClass oc);

}
