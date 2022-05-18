package com.projetofront.thymeleafcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetofront.thymeleafcrud.Model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
