package day6_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Language1 {
    public static void main(String a[]) {
    	Scanner s=new Scanner(System.in);
    	
    	
    	ArrayList<String> list=new ArrayList<String>();
    	list.add("Java");
    	list.add("Python");
    	list.add("Php");
    	list.add("C#");
    	list.add("C++");
    	list.add("C");
    	
    	System.out.println("List:");
    	for (String l:list)
    		System.out.print(l+",");
    	System.out.println("\n");
    	list.remove(2);
    	list.remove(4);
    	System.out.println("Updated list:");
    	for (String l:list)
    		System.out.print(l+",");
    }
}
