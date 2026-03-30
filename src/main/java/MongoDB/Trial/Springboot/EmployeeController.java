package MongoDB.Trial.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	@RequestMapping("/mongo")

public String hellomongo() {
		return "Hello MongoDB";
	}
@RequestMapping("/save")
	public String save(@RequestBody Employee employee) {
	
		employeeRepository.save(employee);
		
		return "Employee saved successfully";
}
}
