package day5_project;

import java.util.Scanner;

public class Array1 {
	public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	int flag=0;
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	int arr[]=new int [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.nextInt();
    	}
    	
    	for(int i=0;i<size;i++) {
    		if (arr[i]%2==0) {
    			flag++;
    		}
    	}
    	if (flag==size)
    	System.out.println("All the elements are even");
    	else
        System.out.println("All the elements are not even");
    }
}
