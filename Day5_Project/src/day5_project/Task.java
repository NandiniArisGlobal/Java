package day5_project;
import java.util.*;

public class Task {
    public static void main(String a[]) {
    	int[] arr={12,43,51};
    	int n=10,n1=0;
    	int[] arr1= null;
    		try {
    			System.out.println(arr[2]);
    			System.out.println(arr[3]);
    			System.out.println(arr1[0]);
    			
    			System.out.println(n/n1);
    		}
    		catch (ArithmeticException e) {
    			System.out.println(e);
    		}
    		catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println(e);
    	    }
    		catch (NullPointerException e) {
    			System.out.println("arr1 is null");
    		}
//    		catch (Exception e) {
//    			System.out.println(e);
//    		}
    }
}



	
	
	

		
	
	  
		
	

