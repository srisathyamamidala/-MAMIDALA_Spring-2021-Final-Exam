/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sri Sathya Mamidala
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employee = new ArrayList<Employee>();
        System.out.println("Sri Sathya Mamidala");
        employee.add(new Employee(15,"Babloo", 10113.67));
	employee.add(new Employee(10, "Chinny",90087.98));
	employee.add(new Employee(03, "vaishu",80097.76));
	employee.add(new Employee(07, "Deepu",11234.05));
	employee.add(new Employee(11, "Kittu",13421.54));
       System.out.println("Students in original order:");
		for(Employee s : employee)
		{
			System.out.println(s);
		}
		System.out.println();
		
		// Sort the employees into natural order by emp id
		Collections.sort(employee);
		System.out.println("Sorting by emp id: ");
		for(Employee s : employee)
		{
			System.out.println(s);
		}
		System.out.println();
		
		
		Collections.sort(employee, new Comparator<Employee>()
      		{
		public int compare(Employee s1, Employee s2)
		{
		if(s1.getEmpSalary() < s2.getEmpSalary())
			return -1;
		else if (s1.getEmpSalary() == s2.getEmpSalary())
		return 0;
		else
		return +1;
		}
      		});
		System.out.println("Employees in increasing order by Salary:");
		for(Employee s : employee)
		{
			System.out.println(s);
		}
		System.out.println();
		
	
		Collections.sort(employee, new Comparator<Employee>()
      		{
			public int compare(Employee s1, Employee s2)
			{
			
			return (s1.getEmployeeName()).compareTo(s2.getEmployeeName());
                        }	
      		});
		System.out.println("Employees in order by name: ");
		for(Employee s : employee)
		{
			System.out.println(s);
		}
		System.out.println();


	}

}
