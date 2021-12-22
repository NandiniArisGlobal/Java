package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_book {
    public static void main(String a[]) {
    	ApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Books b=(Books)c1.getBean("b1");
    	b.display();
    }
}
