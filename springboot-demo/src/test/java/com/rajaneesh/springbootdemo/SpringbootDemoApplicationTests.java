package com.rajaneesh.springbootdemo;

import com.rajaneesh.springbootdemo.dao.EmployeeDao;
import com.rajaneesh.springbootdemo.entities.Employee;
import com.rajaneesh.springbootdemo.services.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringbootDemoApplicationTests {

	@Autowired
	private EmployeeServiceImpl employeeService;

	@MockBean
	private EmployeeDao employeeDao;

	@Test
	//Test for getting all employees from db
	public void getEmployeesTest() {
		when(employeeDao.findAll()).thenReturn(Stream.of(new Employee(1,"1name","1@gmail","1atp","19876"))
				.collect(Collectors.toList()));

		assertEquals(1,employeeService.getEmployees().size());
	}

	@Test
	//Test for a getting an employee based on id
	public void getEmployeeById(){
		Integer id =1;
		when(employeeDao.getReferenceById(id)).thenReturn(
				new Employee(1,"1name","1@gmail","1atp","19876"));

		assertEquals(id,employeeService.getEmployee(id).getId());
	}

	@Test
	// Test for saving an employee
	public void saveEmployeeTest(){
		Employee employee = new Employee(2,"2a","2@gmail","2atp","2312");
		when(employeeDao.save(employee)).thenReturn(employee);

		assertEquals(employee,employeeService.addEmployee(employee));
	}
}
