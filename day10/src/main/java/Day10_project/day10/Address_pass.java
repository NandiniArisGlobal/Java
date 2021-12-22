package Day10_project.day10;

import org.springframework.beans.factory.annotation.Autowired;

public class Address_pass {
@Autowired
Student_address a;

public Student_address getA() {
	return a;
}

public void setA(Student_address a) {
	this.a = a;
}
void displayAddress() {
	a.display();
}
}
