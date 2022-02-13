package learn.lombok.service.employee;

import java.util.List;

import learn.lombok.service.employee.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employeeRequest);

	public List<Employee> getEmployees();
}
