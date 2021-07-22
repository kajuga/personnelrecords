package personnelrecords.dao.interfaces;

import personnelrecords.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee create(Employee employee);
    boolean remove(Long id);
    void update(Long id, Employee employee);
    Employee findById(Long id);
    List<Employee> findAll();
}