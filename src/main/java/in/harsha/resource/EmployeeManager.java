package in.harsha.resource;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	private Employees employees = new Employees();
    public EmployeeManager() {
        
        Employee employee1 = new Employee();
        employee1.setEmployye_id(1);
        employee1.setFirst_name("John");
        employee1.setLast_name("Doe");
        employee1.setEmail("jhon.doe@example.com");
        employee1.setTitle("Software Engineer");

        Employee employee2 = new Employee();
        employee2.setEmployye_id(2);
        employee2.setFirst_name("suresh");
        employee2.setLast_name("reddy");
        employee2.setEmail("suresh@reddy.com");
        employee2.setTitle("Product Manager");
        Employee employee3 = new Employee();
        employee3.setEmployye_id(3);
        employee3.setFirst_name("satish");
        employee3.setLast_name("Johnson");
        employee3.setEmail("satish.johnson@example.com");
        employee3.setTitle("Marketing Specialist");

        Employee employee4 = new Employee();
        employee4.setEmployye_id(4);
        employee4.setFirst_name("swamy");
        employee4.setLast_name("naidu");
        employee4.setEmail("swamy.naidu@example.com");
        employee4.setTitle("Financial Analyst");

        employees.getEmployees().add(employee1);
        employees.getEmployees().add(employee2);
        employees.getEmployees().add(employee3);
        employees.getEmployees().add(employee4);
       
    }

    public Employees getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
    }
}
