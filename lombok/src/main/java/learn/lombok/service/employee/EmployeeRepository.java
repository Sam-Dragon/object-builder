package learn.lombok.service.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import learn.lombok.service.employee.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	public List<Employee> findAll();
}
