package videoTutorial;

public class Car {
	
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 1850.203;
	boolean isTheCarOn = false;
	char condition = 'A';
	int fuelPercent = 100;
	
	public Car(int customMaxSpeed) { // Constructors
		maxSpeed = customMaxSpeed;
	}
	
	public void printVariables() {
		
		System.out.println("Maximum Speed = "+maxSpeed);
		System.out.println("Minimum Speed = "+minSpeed);
		System.out.println("Weight = "+weight+" kg");
		System.out.println("Is the car on? "+isTheCarOn);
		System.out.println("The car is in condition : "+condition);
		System.out.println("The fuel is :"+ fuelPercent+" %");
	}
	
	public void useFuel() {
		
		fuelPercent = 50;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car familyCar = new Car();
//		
//		System.out.println("Family's Car :");
//		familyCar.printVariables();
//		
//		Car papaCar = familyCar;  // Referenced datatypes
//		Car mummyCar = familyCar;
//		Car bhaiyaCar = familyCar;
//		Car iraCar = familyCar;
//		
//		familyCar.useFuel();
//		
//		System.out.println("Bhaiya's Car :");
//		bhaiyaCar.printVariables();
		
		Car birthdayPresent = new Car(200);
		birthdayPresent.printVariables();
		
	}
}