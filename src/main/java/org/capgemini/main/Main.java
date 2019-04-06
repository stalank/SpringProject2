package org.capgemini.main;

import org.capgemini.pojo.Employee;
import org.capgemini.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * Employee e = new Employee(); EmployeeService s = new
		 * EmployeeService(); s.addEmployee(e);
		 */
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");// spring container
		EmployeeService service = (EmployeeService) context.getBean("service");
		//service.setDao(dao); should be called by spring framework
		
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("hashvalue of employee object: "+employee.hashCode());
		
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println("hashvalue of employee object: "+employee2.hashCode());
		
		((ClassPathXmlApplicationContext)context).close();
		
		
		
		/*employee.setEmployee_id(12);
		employee.setEmployee_name("ghjkl");
		employee.setEmployee_salary(456789.21);
		service.addEmployee(employee);*/
		}

}
