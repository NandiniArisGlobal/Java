package day8_project;

import java.util.ArrayList;

public class Stream_java {
    public static void main(String a[]) {
    	ArrayList<String> list=new ArrayList<>();
    	list.add("trd");
    	list.add("tvt");
    	list.add("scg");
    	list.forEach(
(String n)->System.out.println(n));
    }
}
