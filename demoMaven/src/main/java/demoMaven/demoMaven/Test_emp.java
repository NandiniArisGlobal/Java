package demoMaven.demoMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test_emp {
	   public static void main(String a[]) {
	    	ApplicationContext c=new ClassPathXmlApplicationContext("EmpFile.xml");
	    	Emp ee=(Emp)c.getBean("e2");
	    	ee.display();   
	    	System.out.println("\n");
	    	Books b=(Books)c.getBean("b2");
	    	b.display();
	    }
	}

