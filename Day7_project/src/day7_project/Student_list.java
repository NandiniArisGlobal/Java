package day7_project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Student_list {
    public static void main(String a[]) {
    	HashMap<Integer,String> map=new HashMap<>();
    	      //(Key,value) pair
    	map.put(1, "Madhu");
    	map.put(2, "Nandini");
    	map.put(3, "Sandhya");
    	for (Entry<Integer,String> c:map.entrySet()) {
    		System.out.println("Roll No : "+c.getKey()+"   Name : "+c.getValue());
    	}
    }
}

