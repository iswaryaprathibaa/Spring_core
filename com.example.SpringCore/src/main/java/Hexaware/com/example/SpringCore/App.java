package Hexaware.com.example.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  @SuppressWarnings("resource")
public static void main(String[] args) {

//  	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
//  	Employee e1=(Employee)context.getBean("emp1");
//  	Employee e2=(Employee)context.getBean("emp2");
//      System.out.println( e1.toString() );
//      System.out.println(e2.toString());
//      
//    Department d1=(Department)context.getBean("dept1");
//    System.out.println(d1.toString());
//    Employee e1=d1.getEmpobj();
//    System.out.println( e1.toString() );
//  	Result r1=(Result)context.getBean("Result1");
//    System.out.println(r1.toString());
//    Result r2=(Result)context.getBean("Result2");
//    System.out.println(r2.toString());
	  ApplicationContext annot = new ClassPathXmlApplicationContext("beans.xml");;

//      Employee e1= (Employee) annot.getBean("emp1");
//      System.out.println(e1.toString());
//      Department d1=(Department)annot.getBean("dept1");
//    System.out.println(d1.toString());
//    Employee e2=d1.getEmpobj();
//    System.out.println( e2.toString() );
//    ApplicationContext annot = new ClassPathXmlApplicationContext("beans.xml");;

//    Student s1= (Student) annot.getBean("student1");
//    System.out.println(s1.toString());
//    Result r1=(Result)annot.getBean("Result1");
//  System.out.println(r1.toString());
//  Student s2=r1.getStuobj();
//  System.out.println( s2.toString() );
	  Engine e1= (Engine) annot.getBean("Engine1");
	    System.out.println(e1.toString());
	    Car c1=(Car)annot.getBean("car1");
	  System.out.println(c1.toString());
	  Engine e2=c1.getEngineobj();
	  System.out.println( e2.toString() );



  }
}
