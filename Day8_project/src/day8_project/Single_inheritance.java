package day8_project;





public class Single_inheritance {
    public static void main(String[] args) {
    	Science m=new Science();
    	System.out.println("Salary is:"+m.salary);  
    	System.out.println("Bonous is:"+m.bonous);  
    }
}
class Faculty
{  
float salary=30000;  
}  
class Science extends Faculty
{ 
float bonous=2000;
}



