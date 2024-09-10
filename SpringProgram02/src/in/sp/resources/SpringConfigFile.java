package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Student std1()
	{
		Student std=new Student();
		        std.setName("Mohan");
		        std.setRollno(101);
		        std.setEmail("mohan@gmail.com");
		return  std;
	}
	
	
	
	
	@Bean
	public Student std2()
	{
		Student std=new Student();
		        std.setName("Ram");
		        std.setRollno(102);
		        std.setEmail("ram@gmail.com");
		return  std;
	}
	

}
