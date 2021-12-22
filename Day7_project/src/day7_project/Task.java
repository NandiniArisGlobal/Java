package day7_project;

import java.util.ArrayList;

public class Task {
    public static void main(String a[]) {
    	ArrayList<Integer> list=new ArrayList<>();
    	for(int i=1;i<=20;i++)
    		list.add(i);
    	System.out.println(list);
    	ArrayList<Integer> list1=new ArrayList<>();
    	ArrayList<Integer> list2=new ArrayList<>();
    	ArrayList<Integer> list3=new ArrayList<>();
    	int size=list.size();
    	System.out.println(size);
    	int  flag=0;
    	for (int l:list) {
    		if(l%2==0) {
    			list1.add(l);
    		}
    		else {
    			list2.add(l);
    			for (int i=2;i<=l/2;i++) {
    				if (i%2==0) {
    					flag=1;
    					break;
    				}}
    				
    			if (flag==1) {
    				list3.add(l);
    			}
    			
    		
    	}}
    	System.out.println(list1);
    	System.out.println(list2);
    	System.out.println(list3);

    		
    
    	}}
