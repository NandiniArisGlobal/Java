package day3_project;

public class Method3 {
	String name;
  int roll_no;
  
  int x=20;
   public static void main(String aa[]) {
	   
		Method3 m=new Method3();
		m.setname();
		m.setroll_no();
		String n=m.getname();
		System.out.println("Name: "+n);
		int r=m.getroll_no();
		System.out.println("Roll Number: "+r);
		
		//Global and local variable
		Method3 m1=new Method3();
		Method3 m2=new Method3();
		Method3 m3=new Method3();
		
		m1.changeNum();
		System.out.println(m1.x);
		System.out.println(m2.x);
		System.out.println(m3.x);
		
   }
   
   void changeNum() {
//	   int x=89;
		int x;
		this.x=89;
   }
   void setname() {
	   name="Nandini S";
   }
   String getname() {
	   return(name);
   }
   void setroll_no() {
	   roll_no=18;
   }
   int getroll_no() {
	   return(roll_no);
   }
}
