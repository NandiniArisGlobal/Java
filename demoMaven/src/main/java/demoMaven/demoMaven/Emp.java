package demoMaven.demoMaven;

public class Emp {
	String ename,address;
	int id;
	double sal;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	void display() {
		System.out.println("Employee name : "+ename+"    \nId : "+id+"   \nSalary : Rs."+sal+
				"   \nAddress : "+address);
	}
}
