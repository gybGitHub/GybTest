package com.gem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.gem.vo.Employee;

public interface EmployeeMapper {

	//void update(Employee emp);

	//Employee getEmployeeById(String empId);
	
	
	@Select("SELECT * FROM Employee order by empId asc")
	List<Employee> getAllEmployee();
	
}
