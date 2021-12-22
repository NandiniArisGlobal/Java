package demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_employee {
    public static void main(String a[]) {
    	ApplicationContext c=new ClassPathXmlApplicationContext("MyFile.xml");
    	Employee e=(Employee)c.getBean("e1");
    	e.display();   
    }
}
