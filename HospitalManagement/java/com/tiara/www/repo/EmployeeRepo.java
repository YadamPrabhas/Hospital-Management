package com.tiara.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiara.www.model.Employee;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Long>{

}
