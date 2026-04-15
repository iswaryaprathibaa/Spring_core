package Hexaware.SpringCollections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentConfig {
	@Bean(name="dept1")
	public Department getDepartment() {
		Department d=new Department();
		d.setDeptId(101);
		d.setDeptName("Sales");
		return d;
	}
}
