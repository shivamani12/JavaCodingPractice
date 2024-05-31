package Rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Employee {

	String name;
	  int age;
	  int salary;
	  String department;
	  
	  
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	Employee(String name, int age, String department){
		  this.name=name;
		  this.age=age;
		  this.department=department;
	  }
	  
	
	  @Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}
	public String getFirstName() {
	  	return name;
	  }

	  public void setFirstName(String name) {
	  	this.name = name;
	  }

	  public int getAge() {
	  	return age;
	  }

	  public void setAge(int age) {
	  	this.age = age;
	  }	 
 public static void main(String[] args){
	
	        		    	

	 ArrayList<Employee> emplist=new ArrayList<Employee>();
	 
	 emplist.add(new Employee("shivam",15,15000,"Engineering"));	 
	 emplist.add(new Employee("osho",18,20500,"Engineering"));	 
	 emplist.add(new Employee("Amit",40,35000,"Science"));	 
	 emplist.add(new Employee("Rahul",40,25000,"Science"));	 
	 emplist.add(new Employee("Tony",65,55000,"Engineering"));	 
	 emplist.add(new Employee("Janu",75,85000,"Engineering"));	 
	 
	Employee emp=emplist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
			.skip(2).findFirst().get();
//	System.out.println(emp);
	 
	
	Employee em=emplist.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();
//	System.out.println(em);
	
	List<Employee>l2=emplist.stream().sorted(Comparator.comparing(Employee::getAge)
			.thenComparing(Employee::getName))
			.collect(Collectors.toList());
//System.out.println(l2);
	
	
	
	
 }
public Employee(String name, int age, int salary, String department) {
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.department=department;
}
	 		
	 		
	 		
	 		
	 			
	 		
	 		
	 		
	 			
	 			
	 				
	 			
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        	
 }


