package Hexaware.SpringCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Hexaware.SpringAnnotations.BookConfig;

public class App {
  public static void main(String[] args) {
//    System.out.println("Hello World!");
//	  ClassPathXmlApplicationContext annot = new ClassPathXmlApplicationContext("beans.xml");
//	  College c1=(College)annot.getBean("College1");
//	    System.out.println(c1.toString());
//	    Items it1=(Items)annot.getBean("item1");
//	    System.out.println(it1.toString());
//	    Items it2=(Items)annot.getBean("item2");
//	    System.out.println(it2.toString());
//	  Department dept= (Department)annot.getBean("dept1");
//	  System.out.println(dept.toString());
//	  Employee e=(Employee)annot.getBean("emp1");
//	  System.out.println(e.toString());
//	  annot.registerShutdownHook();
	  AnnotationConfigApplicationContext annot = new AnnotationConfigApplicationContext(DepartmentConfig.class);
	  Department dept= (Department)annot.getBean("dept1");
	  System.out.println(dept.toString());	 
	  annot.close();
  }
}
