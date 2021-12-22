package demo;

public class Books {
String publish,id,price;

public String getPublish() {
	return publish;
}

public void setPublish(String publish) {
	this.publish = publish;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}
void display() {
	System.out.println("Publisher : "+publish+"    \nId : "+id+"   \nPrice : Rs."+price);
}
}
