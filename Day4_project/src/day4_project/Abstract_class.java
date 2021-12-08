package day4_project;

public class Abstract_class {
   public static void main(String[] args) {
	   animalSound a=new animalSound();
	   a.eat();
	   a.makeSound();
	   Brake b=new Brake();
	   b.brake();
   }
}
abstract class Animal {
	  abstract void makeSound();

	  public void eat() {
	  System.out.println("Animals Eat");
	  }
	}
class animalSound extends Animal {

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Animals Sound");
	}
	
}


//MOTORBIKE
abstract class MotorBike {
	  abstract void brake();
	}
class Brake extends MotorBike{

	@Override
	void brake() {
		// TODO Auto-generated method stub
		System.out.println("Apply Brake");
	}
	
}