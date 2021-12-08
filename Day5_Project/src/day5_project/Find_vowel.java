package day5_project;

import java.util.Scanner;

public class Find_vowel {
	public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	int flag=0;
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	char arr[]=new char [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.next().charAt(0);
    	}
    	System.out.println("Enter a vowel:");
    	char ch=s.next().charAt(0);
    	
    	for(int i=0;i<arr.length;i++) {
    		if (ch==arr[i]) {
    		flag=1;
    		}
    	}
    	if(flag==1) {
    		System.out.println("The given vowel "+ch+ " is found in the given array");
    	}
    	else
    		System.out.println("The given vowel "+ch+ " is not found in the given array");
    }
}
