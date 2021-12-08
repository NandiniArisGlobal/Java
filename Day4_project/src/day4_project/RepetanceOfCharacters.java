package day4_project;
import java.util.*;

public class RepetanceOfCharacters {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a string");
    	String str=s.next();
    	int count=0;
    	System.out.println("Enter a character to be counted:");
    	char ch=s.next().charAt(0);
    	for (int i=0;i<str.length();i++) {
    		if (str.charAt(i)==ch) {
    			count++;
    		}
    	}
    	System.out.println("Number of "+ch+"'s in the given string is "+count);;
    }
}
