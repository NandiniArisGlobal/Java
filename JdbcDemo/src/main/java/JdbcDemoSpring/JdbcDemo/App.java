package JdbcDemoSpring.JdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeOperations op=(EmployeeOperations)context.getBean("operationdemo");
        
        Db e1=new Db();
        e1.setName("Nandini S");
        e1.setId("765");
        e1.setEmail("nandini.s@arisglobal.com");
        e1.setSalary("1000");
        int result=		op.insert(e1);
        System.out.println(result);
        
        Db e2=new Db();
        e2.setName("Sandhya S");
        e2.setId("12");
        e2.setEmail("sjnssm3@gmail.com");
        e2.setSalary("10000");
        int result1=		op.insert(e2);
        System.out.println(result1);
    }
}
