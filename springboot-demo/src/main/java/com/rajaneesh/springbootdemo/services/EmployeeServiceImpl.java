package com.rajaneesh.springbootdemo.services;

import com.rajaneesh.springbootdemo.dao.EmployeeDao;
import com.rajaneesh.springbootdemo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * Method to retrieve all employees from the database.
     * @params none
     * @return List<Emplotyee> - list of Employees
     */
    @Override
    public List<Employee> getEmployees() {
          return employeeDao.findAll();
    }

    /**
     * Method for retrieving an employee based on id
     * @param id of employee
     * @return List<employee> - List of employee
     */
    @Override
    public Employee getEmployee(Integer id) {
        return employeeDao.getReferenceById(id);
    }

    /**
     * Method for saving an employee to database.
     * @param employee
     * @return employee object
     */
    @Override
    public Employee addEmployee(Employee employee) {
        employeeDao.save(employee);
        return employee;
    }
}
