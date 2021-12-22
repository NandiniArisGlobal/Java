package day8_project;

public class Lambda_expression {
    public static void main(String a[]) {
    	cal c=()->{
    		System.out.println("add");
    	};
    	c.add();
    }
}


interface cal{
	void add( );
}