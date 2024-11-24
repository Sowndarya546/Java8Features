package com.example.Java8Features.Controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Java8Features.Model.Employee;
import com.example.Java8Features.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployeesByCity")
	public Map<String, List<Employee>> getEmployeesByCity(){
		return employeeService.getEmployeesByCity();
	}
	
	@GetMapping("/getEmployeesByAge")
	public Map<Integer, List<Employee>> getEmployeesByAge(){
		return employeeService.getEmployeesByAge();
	}
	
	@GetMapping("/getEmployeesCountByGender")
	public Map<String, Long> getEmployeesCountByGender(){
		return employeeService.getEmployeesCountByGender();
	}
	
	@GetMapping("/getEmployeesDept")
	public List<String> getEmployeesDept(){
		return employeeService.getEmployeesDept();
	}
	
	@GetMapping("/getEmployeesAge28")
	public List<Employee> getEmployeesAge28(){
		return employeeService.getEmployeesAge28();
	}
	
	@GetMapping("/getEmpMaxAge")
	public int getEmpMaxAge(){
		return employeeService.getEmpMaxAge();
	}
	
	@GetMapping("/getEmpAvgAgeByGender")
	public Map<String, Double> getEmpAvgAgeByGender(){
		return employeeService.getEmpAvgAgeByGender();
	}
	
	@GetMapping("/getEmpCountByDept")
	public Map<String, Long> getEmpCountByDept(){
		return employeeService.getEmpCountByDept();
	}
	
	@GetMapping("/getOldestEmp")
	public Employee getOldestEmp(){
		return employeeService.getOldestEmp();
	}
	
	@GetMapping("/getYoungFemaleEmp")
	public Employee getYoungFemaleEmp(){
		return employeeService.getYoungFemaleEmp();
	}
	
	@GetMapping("/getDeptNameByHighNoEmp")
	public String getDeptNameByHighNoEmp(){
		return employeeService.getDeptNameByHighNoEmp();
	}
	@GetMapping("/getDeptNoBy3")
	public List<String> getDeptNoBy3(){
		return employeeService.getDeptNoBy3();
	}
	
	@GetMapping("/getEmpNamesByCity")
	public List<Employee> getEmpNamesByCity(){
		return employeeService.getEmpNamesByCity();
	}
	
	@GetMapping("/getDeptNameWithHighNo")
	public Entry<String, Long> getDeptNameWithHighNo(){
		return employeeService.getDeptNameWithHighNo();
	}
	
	@GetMapping("/getEmpSortedByAgeName")
	public List<Employee> getEmpSortedByAgeName(){
		return employeeService.getEmpSortedByAgeName();
	}
	
	@GetMapping("/getavgSalBydept")
	public Map<String,Double> getavgSalBydept(){
		return employeeService.getavgSalBydept();
	}
	
	@GetMapping("/get2ndHighsal")
	public Employee get2ndHighsal(){
		return employeeService.get2ndHighsal();
	}
	
	@GetMapping("/getHighsalByDept")
	public Map<String, Object> getHighsalByDept(){
		return employeeService.getHighsalByDept();
	}
	
	@GetMapping("/hello")
	public String welcome(){
		return "Heloooo";
	}

}
