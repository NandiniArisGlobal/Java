package day7_project;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Set1 {
    public static void main(String a[]) {
    	Set<String> set=new HashSet<>();
    	set.add("red");
    	set.add("red");
    	set.add("blue");
    	set.add("red");
    	set.add("yellow");
    	set.add("red");
    	System.out.println(set);
    	Iterator i=set.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());	
    	}
    	
    }
}
