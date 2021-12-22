package day7_project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ListIterator;
import java.util.Map;

public class Set2 {
    public static void main(String a[]) {
    	ArrayList<String> set=new ArrayList<>();
    	set.add("red");
    	set.add("red");
    	set.add("blue");
    	set.add("red");
    	set.add("yellow");
    	set.add("red");
    	System.out.println(set);
    	ListIterator i=set.listIterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());	
    	}
    	while( i.hasPrevious()) {
    		System.out.println(i.previous());	
    	}
    }
}
