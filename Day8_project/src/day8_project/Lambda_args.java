package day8_project;

public class Lambda_args {
	public static void main(String a[]) {
    	cal1 c=(int x)->{
    		System.out.println(x);
    	};
    	c.add(45);
    }
}


interface cal1{
	void add(int a );
}

