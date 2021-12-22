package Day10_project.day10;

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
        ApplicationContext message=new ClassPathXmlApplicationContext("MsgFile.xml");
        PassMessage pass=(PassMessage)message.getBean("msgpass");
        pass.displayMsg();
        
        Address_pass p=(Address_pass)message.getBean("add_pass");
        p.displayAddress();
        
        Employee e1=(Employee)message.getBean("salary_pass");
        e1.displaySalary();
    }
}
