package day4_project;

public class Pattern3 {
	
		public static void main(String[] args) 
		{
		int i, j, k;
		for(i=7;i>=1;i--)
		{
		for(j=1;j<=i;j++)
		{
		System.out.print(" ");
		}
		for(k=7;k>=i;k--)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		}
		
}
