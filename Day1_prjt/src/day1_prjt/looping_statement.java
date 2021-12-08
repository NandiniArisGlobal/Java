package day1_prjt;

public class looping_statement {

	public static void main(String[] args) {
		
		//factorial of a number
		int n=6,i=1;
		for( int m=n;m>=1;m--) {
			i=m*i;
		}
		System.out.print("Factorial of "+n);
		System.out.print(" is "+i);
		
		//sum of first 100 even numbers
		
		int sum=0;
		for (int j=1;j<=200;j++) {
			if(j%2==0) {
				sum+=j;
			}
		}
		System.out.print("\nThe sum is "+sum);
		
		//sum of first 50 odd numbers
		
		int sumn=0;
		for (int i1=0;i1<100;i1++) {
			if((i1+1)%2==0) {
				sumn+=i1;
			}
			}
		System.out.print("\nThe sum is "+sumn);
		
		//sum of numbers divisible by 3 and 9 from 1 to 1000
		
		int ii,sum1=0;
		for(ii=1;ii<=1000;ii++) {
			if (ii%3==0 && ii%9==0) {
				sum1+=ii;
			}
		}
		System.out.print("\nThe sum of numbers divisible by 3 and 9 from 1 to 1000 is "+sum1);
		System.out.print("\n");
		
		//To check the given number is a prime number or not
		
		int num = 4;
		 boolean flag=false;
	    for (int ii1 = 2; ii1 <= num / 2; ++ii1) {
	      if (num % ii1 == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag) {
	      System.out.println(num + " is a prime number.\n");}
	    else {
	      System.out.println(num + " is not a prime number.\n");}
	    
	    //Fibonacci series
	    
	    
	    //Printing the pattern
	    
	    int x,y;
	    for (x=1;x<=4;x++) {
	    	for(y=1;y<=x;y++) {
	    		System.out.print("* ");	
	    	}
    	System.out.print("\n");
	    }
	}
}
