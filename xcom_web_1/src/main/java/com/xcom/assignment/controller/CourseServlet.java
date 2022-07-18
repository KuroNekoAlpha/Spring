/**
 * 
 */
package com.xcom.assignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;

import com.xcom.assignment.listener.SpringContainerManager;
import com.xcom.assignment.model.CourseModel;

/**
 * @author OAK SOE KHANT
 *
 */
@WebServlet(urlPatterns = {
		"/","/courses","course-edit","course-save"
})
public class CourseServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	private CourseModel courseModel;
	
	@Override
	public void init() throws ServletException {
		var springContext=getServletContext().getAttribute(SpringContainerManager.SPRING_CONTEXT);
		if(null!=springContext && springContext instanceof BeanFactory factory) {
			System.out.println(factory.getBean("message"));
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Answer:"+req.getServletPath());
		var page=switch(req.getServletPath()) {
	
		case "/course-edit"->"/course-edit.jsp";
		default->{
			//Load Course and set result to request scope
			yield "/index.jsp";
		}
		};
		getServletContext().getRequestDispatcher(page).forward(req, resp);;
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	

}
