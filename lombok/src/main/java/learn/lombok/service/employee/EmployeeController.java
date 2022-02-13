package learn.lombok.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.lombok.service.employee.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employeeRequest) {
		return service.addEmployee(employeeRequest);
	}

	@GetMapping
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}
}
