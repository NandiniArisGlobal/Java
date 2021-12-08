package day5_project;
import java.util.Scanner;

public class Duplicate_number {
	public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	int count=0;
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	int arr[]=new int [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.nextInt();
    	}
    	int num = 8;
    	for(int i=0;i<size;i++) {
    		
    		if(arr[i]==num) {
    			count++;
    		}
    	}
    	System.out.println("The number "+num+" is repeated "+count+" times");
    }
}
