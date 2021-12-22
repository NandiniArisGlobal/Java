package day7_project;

import java.util.HashMap;
import java.util.Map.Entry;

public class Scores {
	 public static void main(String a[]) {
	    	HashMap<String,Integer> score=new HashMap<>();
	    	      //(Key,value) pair
	    	score.put("Java", 79);
	    	score.put("Python", 86);
	    	score.put("C++", 64);
	    	for (Entry<String, Integer> c:score.entrySet()) {
	    		System.out.println("Subject : "+c.getKey()+"    Score : "+c.getValue());
	    	}
	    	
	    }
}
