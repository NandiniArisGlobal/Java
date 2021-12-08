package day2_project;

public class Loop_statement {
	public static void main(String aa[])
    {
    int a=21;
    while(a>=20)
    {
        System.out.print("working!!!\n");
        a--;
    }
    
    //Table of number
    int num=18,i=1;
    while(i<=10) {
    	System.out.println(num+ "*"+i+"=" +(num*i));
    	i++;
    }
    System.out.println("\n\n");
    int num1=8,i1=1;
    do {
    	System.out.println(num1+ "*"+i1+"=" +(num1*i1));
    	i1++;
    }
while(i1<=10);
}
}
