package day5_project;

import java.util.Scanner;

public class String_array {
	public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	String arr[]=new String [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.next();
    	}
    	System.out.println("The array:");
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    }
}
