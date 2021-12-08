package day5_project;

public class Null_exception {
    public static void main(String a[]) {
    	try {
    		String var=null;
        	System.out.println(var.charAt(3));
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
