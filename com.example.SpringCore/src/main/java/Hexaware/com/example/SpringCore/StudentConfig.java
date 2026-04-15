package Hexaware.com.example.SpringCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean(name="Str1")
	public Student getStudent(){
		Student s=new Student();
		s.setStuId(101);
		s.setStuName("Nate");
		s.setMarks(455.89);
		
		return s;
	}
	@Bean(name="College1")
	public College getCollege(){
		College c=new College();
		c.setC_id(1001);
		c.setC_name("abc");
		
		return c;
	}
}
