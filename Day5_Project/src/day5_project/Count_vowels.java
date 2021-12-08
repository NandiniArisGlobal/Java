package day5_project;

import java.util.Scanner;

public class Count_vowels {
	public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	int count=0;
    	System.out.println("Enter the size of the array:");
    	int size=s.nextInt();
    	char arr[]=new char [size];
    	System.out.println("Enter the array elements:");
    	for(int i=0;i<size;i++) {
    		arr[i]=s.next().charAt(0);
    	}
    	
    	
    	for(int i=0;i<arr.length;i++) {
    		if (arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
    				arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
    		count++;
    		}
    	}
    	System.out.println("Number vowels in the array: "+count); 
    }
}
