package day6_project;

import java.util.ArrayList;

public class Language {
    public static void main(String a[]) {
    	ArrayList<score> s=new ArrayList<>();
    	score s1=new score("Java",9);
    	score s2=new score("Android",8);
    	s.add(s1);
    	s.add(s2);
    	for(score ss:s) {
    		System.out.println("Language: "+ss.getLang()+"   Score: "+ss.getMark());
    	}
    }
}


class score{
	String lang;
	int mark;
	public score(String lang, int mark) {
		this.lang = lang;
		this.mark = mark;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}	
	
}