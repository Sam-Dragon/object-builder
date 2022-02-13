package learn.lombok.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.lombok.service.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("Employee Object :: " + employee);

		return repository.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = repository.findAll();

		return employees;
	}
}
