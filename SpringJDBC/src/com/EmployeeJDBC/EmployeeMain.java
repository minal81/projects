package com.EmployeeJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO myBean=(EmployeeDAO) beanFactory.getBean("edao");
		
		//insert data
		//System.out.println("inserted"+myBean.saveEmployee(new Employee(101,"minal","30000")));
		//System.out.println("inserted"+myBean.saveEmployee(new Employee(102,"satish","35000")));
		  
		
		//update data
		//System.out.println("updated"+myBean.saveEmployee(new Employee(101,"minal","1000")));
		
		//delete data
		/*Employee e=new Employee();
		e.setId(101);
		System.out.println("Sucessfully deleted"+myBean.DeleteEmployee(e));
		*/
		
		List<Employee> e1=myBean.viewEmployee();
		System.out.println("ID \t\t\t "+"name \t\t\t"+"salary \t\t\t");	
		System.out.println("---------------------------------------------------------------------------------");
		for(Employee emp:e1)
		{
			System.out.println(emp.getId()+"\t\t\t"+emp.getName()+"\t\t\t"+emp.getSalary());
		}
		
	
		

	}

}
