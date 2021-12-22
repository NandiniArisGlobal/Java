package day7_project;

import java.util.ArrayList;

public class List_list {
    public static void main(String a[]) {
    	ArrayList<Integer> list=new ArrayList<>();
    	list.add(65);
    	list.add(3);
    	list.add(82);
    	ArrayList<Integer> list1=new ArrayList<>();
    	list1.add(4);
    	list1.add(7);
    	ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
    	list2.add(list);
    	list2.add(list1);
    	System.out.println(list2);
    	list1.clear();
    	System.out.println(list2);
    	list1.add(20);
    	list1.add(6);
    	list2.add(list1);
    	System.out.println(list2);
    }	
}
