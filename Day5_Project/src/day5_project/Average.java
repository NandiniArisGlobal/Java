package day5_project;
import java.util.*;

public class Average {
    public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	double sum=0,avg;
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	int arr[]=new int [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.nextInt();
    	}
    	for(int i=0;i<size;i++) {
    		sum+=arr[i];
    	}
    	avg=sum/size;
    	System.out.println("Average of the array elements: "+avg);
    }
}
