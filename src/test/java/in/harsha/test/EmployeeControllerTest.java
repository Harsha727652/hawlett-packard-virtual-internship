package in.harsha.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import in.harsha.resource.Employee;
import in.harsha.resource.EmployeeController;
import in.harsha.resource.EmployeeManager;
import in.harsha.resource.Employees;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @Test
    public void testGetEmployees() {
        Employees employees = new Employees();
        when(employeeManager.getEmployees()).thenReturn(employees);

        assertEquals(employees, employeeController.getEmployees());
    }

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer");

        employeeController.addEmployee(employee);

        verify(employeeManager).addEmployee(employee);
    }
}

