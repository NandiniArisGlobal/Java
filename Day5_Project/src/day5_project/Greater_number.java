package day5_project;

import java.util.Scanner;

public class Greater_number {
	public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	int arr[]=new int [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.nextInt();
    	}
    	int num = arr[0];
    	for(int i=0;i<size;i++) {
    		
    		if(arr[i]>num) {
    			num=arr[i];
    		}
    	}
    	System.out.println("Greatest number: "+num);
    }
}
