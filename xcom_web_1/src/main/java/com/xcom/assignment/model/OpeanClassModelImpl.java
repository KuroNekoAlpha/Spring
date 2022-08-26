/**
 * 
 */
package com.xcom.assignment.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.xcom.assignment.domain.Course;
import com.xcom.assignment.domain.OpenClass;

/**
 * @author OAK SOE KHANT
 *
 */ 
public class OpeanClassModelImpl implements OpenClassModel {
	
	private static final String SELECT_ALL="select oc.id,oc.start_date,oc.teacher,c.id courseId,c.name,c.duration,c.fees,"
										+ "c.description from open_class oc join course c on oc.course_id=c.id where c.id=? ";
	
	private DataSource dataSource;
	
	

	public OpeanClassModelImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public List<OpenClass> findByCourse(int courseId) {
		var list=new ArrayList<OpenClass>();
		try(var conn=dataSource.getConnection();
				var stmt=conn.prepareStatement(SELECT_ALL)){
			stmt.setInt(1, courseId);
			var result=stmt.executeQuery();
			
			while(result.next()) {
				var c=new Course();
				c.setId(result.getInt("courseId"));
				c.setName(result.getString("name"));
				c.setDuration(result.getInt("duration"));
				c.setFees(result.getInt("fees"));
				c.setDescription(result.getString("description"));
				
				var oc=new OpenClass();
				oc.setCourse(c);
				oc.setId(result.getInt("id"));
				oc.setTeacher(result.getString("teacher"));	
				oc.setStartDate(result.getDate("start_date").toLocalDate());
				list.add(oc);
			}
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void create(OpenClass oc) {
		// TODO Auto-generated method stub
		
	}
	
	

}
