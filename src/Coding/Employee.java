package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Employee {

	public static void main(String[] args) {
		
		// creare three emp independent
		Employee emp=new Employee("Shivam",5500);	
		Employee emp1=new Employee("Rahul",6500);		
		Employee emp2=new Employee("Gogo",7500);
		
		
//		complete data by Object
		System.out.println(emp);
		
//		get name only
		System.out.println(emp.getName());
	
		
//		create 3 employee in one unit list
		Employee[] EmployeesList=new Employee[3];
		
		// employee stores in one unit (EmployeeList)
		EmployeesList[0]=new Employee("Mayur",8500);
		EmployeesList[1]=new Employee("Abhi",9500);
		EmployeesList[2]=new Employee("Zjok",1500);
		
		// before sorting
		System.out.println(Arrays.toString(EmployeesList)); // thats how we can print obj
		
		// After Sorting in asc order
		Arrays.sort(EmployeesList, new salarycomparator());
		System.out.println(Arrays.toString(EmployeesList));
		
//		sorting in desc. order
//		create new comparator which will be in desc order
	Comparator<Employee> descComparator= Collections.reverseOrder(new salarycomparator());
	Arrays.sort(EmployeesList,descComparator);
	System.out.println(Arrays.toString(EmployeesList));
	

//	// Convert array into arraylist and perform sorting order
	System.out.println("Convert array int array List");
	List<Employee> EmpList=new ArrayList<Employee>();
	
	for(Employee e: EmployeesList) {
		EmpList.add(e);
	}
	
	System.out.println("**Sort salaryy of collection in asc order**");
	Collections.sort(EmpList,new salarycomparator());	
	System.out.println(EmpList);
	
	System.out.println("**Sort salaryy of collection in desc order**");
	Comparator ComDesc=Collections.reverseOrder(new salarycomparator());
	Collections.sort(EmpList,ComDesc);
	System.out.println(EmpList);
	
	
	
	}
	String name;
	
	int salary;
	Employee (){
		
	}
	
	Employee (String name,int Salary){
		this.name=name;
		this.salary=Salary;
	}
	
	public String getName() {
		return name;
	}
	
	
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Name="+name+" "+"Salary="+salary;
	}
}

class salarycomparator implements Comparator<Employee>{
	
	public int compare (Employee emp1, Employee emp2) {
		return emp1.getSalary()-emp2.getSalary();
	}

	

	
	
	
}

