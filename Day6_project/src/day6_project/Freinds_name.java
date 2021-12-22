package day6_project;

import java.util.ArrayList;

public class Freinds_name {
    public static void main(String a[]) {
    	ArrayList<frnd> f=new ArrayList<>();
    	frnd f1=new frnd("Nandini","8634787349","Nandu");
    	frnd f2=new frnd("Sandhya","7365657098","Sandu");
    	frnd f3=new frnd("Madhumitha","6532465899","Madhu");
    	f.add(f1);
    	f.add(f2);
    	f.add(f3);
    	for (frnd ff:f) {
    		System.out.println("Name : "+ff.frnd_name+"   Mob No : "+ff.mob_no+
    				"   Nick Name : "+ff.nick_name);
    	}
    }
}


class frnd{
	String frnd_name;
	String mob_no;
	String nick_name;
	public frnd(String frnd_name, String mob_no, String nick_name) {
		this.frnd_name = frnd_name;
		this.mob_no = mob_no;
		this.nick_name = nick_name;
	}
	
}