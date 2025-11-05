package com.tiara.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiara.www.model.Employee;
import com.tiara.www.repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

   
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = getEmployeeById(id);
        if (existing != null) {
            existing.setName(employee.getName());
            existing.setDepartment(employee.getDepartment());
            existing.setRole(employee.getRole());
            existing.setEmail(employee.getEmail());
            existing.setPhone(employee.getPhone());
            existing.setAddress(employee.getAddress());
            return employeeRepository.save(existing);
        }
        return null;
    }

  
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
