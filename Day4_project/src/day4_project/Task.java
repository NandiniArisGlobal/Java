package day4_project;
import java.util.*;

public class Task {
	public static void main(String[] args) {
				String str = "hello";
				String rev="";
				for ( int i = str.length(); i >0 ; i--) {
					rev =rev+ str.charAt(i-1);
				}
					System.out.println(rev);
					
					//Draw the pattern
				
				for (int j=7;j>0;) {
					System.out.print(" ");
					for(int i=j;i>0;i--) {
							System.out.print("*");
						}
					j=j-2;
					System.out.print(" ");
					System.out.print("\n");
				}
				
				// Power of a number
				
				int power=4;
				int num=5,ans=1;
				for (int i=power;i>0;i--) {
					ans=ans*num;
				}
				System.out.println(ans);
				
				// Counting the number of vowels 
				String str1="ioeutdhaldjao";
				int count=0;
				
			        for (int ii = 0; ii < str1.length(); ii++) {
			        	char ch = str1.charAt(ii);
			            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			            {
			            	count++;
			            }
			        }
			        System.out.println("Number of vowels: "+count);
			        
			        //Swap numbers
			        int a=5,b=3,temp;
			        System.out.println("The numbers are: a="+a+" and b="+b);
			        temp=a;
			        a=b;
			        b=temp;
			        System.out.println("Numbers after swapping: a="+a+" and b="+b);
			        
			        
			        //ASCII value 
			        int val;  
			        for (char i='A';i<='Z';i++) {
			        	val=i;
			        	System.out.println("The ASCII value of " + i + " is: " + val);
			        }
			          
			        
			        //Factorial
			        int num1=3;
			        Task t=new Task();
			        int fact=t.factorial(num1);
			        System.out.println("Factorial of "+num1+" is "+fact);
			        
	}
	int factorial( int num) {
		int fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		return(fact);
	}
}
			            
				
			
		

	

