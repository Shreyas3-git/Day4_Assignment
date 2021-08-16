package io.spring.database;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePayRoll_Controller 
{
	@Autowired
	EmployeePayRoll_Service employeeService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/retrive")
	public List<EmployeePayRoll> getAllDetails()
	{
		return employeeService.getAllDetails();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/retrive/{id}")
	public EmployeePayRoll findById(@PathVariable long id,@RequestBody EmployeePayRoll employee)
	{
		return employeeService.getById(id, employee);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/insert")
	public void addRecord(@Valid @RequestBody EmployeePayRoll employee)
	{
		employeeService.insertRecord(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value= "/update/{id}")
	public void ModifyRecord(@Valid @PathVariable long id,@RequestBody EmployeePayRoll employee)
	{
		employeeService.updateRecord(id, employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
	public void removeRecord(@PathVariable long id)
	{
		employeeService.deleteRecord(id);
	}
}
