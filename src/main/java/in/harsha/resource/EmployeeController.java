package in.harsha.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	 private final EmployeeManager employeeManager;

	    public EmployeeController(EmployeeManager employeeManager) {
	        this.employeeManager = employeeManager;
	    }

	    @GetMapping
	    public Employees getEmployees() {
	        return employeeManager.getEmployees();
	    }
	    @PostMapping
	    public String addEmployee(@RequestBody Employee employee) {
	        employeeManager.addEmployee(employee);
	        return "added successfully";
	    }
}
