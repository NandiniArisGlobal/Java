package day7_project;

import java.util.HashMap;

public class HashMethods {
    public static void main(String a[]) {
    	HashMap<Integer,String> map=new HashMap<>();
    	      //(Key,value) pair
    	map.put(1, "abc");
    	map.put(2, "xyz");
    	map.put(3, "pqr");
    	System.out.println(map);
    	System.out.println("\n");
    	map.replace(2, "tuy");
    	System.out.println(map);
    	map.remove(2);
    	System.out.println("\n");
    	System.out.println(map);
    	boolean a1=map.isEmpty();
    	System.out.println("\n");
    	System.out.println("List is empty:"+a1);
    	HashMap<Integer,String> map1=new HashMap<>();
    	System.out.println("\n");
    	map1.put(1, "abc");
    	map1.put(2, "xyz");
    	map1.put(3, "pqr");
    	System.out.println(map1);
    	System.out.println("\n");
    	System.out.println("Lists are equal:"+map.equals(map1));
    	map.clear();
    	System.out.println(map);
    	System.out.println("\n");
    	System.out.println(map1.get(1));
    	System.out.println("Size of list1 : "+map1.size());
    }
}
