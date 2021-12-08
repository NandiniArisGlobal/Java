package day5_project;

public class Custom_exceptionHandling {
    public static void main(String[] args) throws MyExcpt,nullExcpt {
    	int[] arr={12,43,51};
    	int n=16;
    	int[] arr1= null;
    	if (n<18) {
    		throw new MyExcpt("Age should be above 18");
    	}
//    	if (arr1==null) {
//    		throw new nullExcpt("The array value is null");
//    	}
    }
}
 

class MyExcpt extends Exception{
	 MyExcpt(String msg) {
		System.out.println(msg);
	}
//	
//	void arrayExcpt(String msg) {
//		System.out.println(msg);
//	}
}
class nullExcpt extends Exception{
	nullExcpt(String msg) {
		System.out.println(msg);
	}
}