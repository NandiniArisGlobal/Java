package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String a[]) {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Student s=(Student)context.getBean("s1");
    	s.display();
    }
}
