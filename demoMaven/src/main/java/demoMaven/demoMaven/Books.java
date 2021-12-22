package demoMaven.demoMaven;

public class Books {
	String publish,id,price;

	public Books(String publish, String id, String price) {
		
		this.publish = publish;
		this.id = id;
		this.price = price;
	}
	void display() {
		System.out.println("Publisher : "+publish+"    \nId : "+id+"   \nPrice : Rs."+price);
	}
}
