package in.harsha.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import in.harsha.resource.Employee;
import in.harsha.resource.EmployeeManager;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @Before
    public void setup() {
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer");

        employeeManager.addEmployee(employee);

        assertEquals(1, employeeManager.getEmployees().getEmployees().size());
        assertEquals(employee, employeeManager.getEmployees().getEmployees().get(0));
    }
}

