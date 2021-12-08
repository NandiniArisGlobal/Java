package day5_project;
import java.util.*;

public class Array {
    public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	int sum=0;
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	int arr[]=new int [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.nextInt();
    	}
    	System.out.println("The array:");
    	for(int i=0;i<size;i++) {
    		System.out.println(arr[i]);
    		sum+=arr[i];
    	}System.out.println("Sum of the array elements: "+sum);
    }
}
