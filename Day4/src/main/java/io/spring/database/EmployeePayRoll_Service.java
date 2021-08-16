package io.spring.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayRoll_Service 
{

	@Autowired
	private EmplyeePayRoll_Repository emp_Repository;
	
	public List<EmployeePayRoll> getAllDetails()
	{
		List<EmployeePayRoll> employee = new ArrayList<>();
		emp_Repository.findAll().forEach(employee :: add);
		return employee;
	}
	
	public EmployeePayRoll getById(long id,EmployeePayRoll employee)
	{
		return emp_Repository.findById(id).orElse(null);
	}
	
	public void insertRecord(EmployeePayRoll employee)
	{
		emp_Repository.save(employee);
	}
	
	public void updateRecord(long id,EmployeePayRoll employee)
	{
		emp_Repository.save(employee);
	}
	
	public void deleteRecord(long id)
	{
		emp_Repository.deleteById(id);
	}
}
