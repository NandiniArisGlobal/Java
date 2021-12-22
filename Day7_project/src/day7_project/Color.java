package day7_project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Color {
	 public static void main(String a[]) {
	    	HashMap<String,String> color=new HashMap<>();
	    	      //(Key,value) pair
	    	color.put("color1", "red");
	    	color.put("color2", "blue");
	    	color.put("color3", "yellow");
	    	for (Entry<String, String> c:color.entrySet()) {
	    		System.out.println(c.getKey()+":"+c.getValue());
	    	}
	    	
	    }
	}

