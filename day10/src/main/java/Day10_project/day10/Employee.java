package Day10_project.day10;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
@Autowired
Emp_Salary e;

public Emp_Salary getE() {
	return e;
}

public void setE(Emp_Salary e) {
	this.e = e;
}
void displaySalary() {
	e.display();
}
}
