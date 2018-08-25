package animal;

public class Animal {
	public int age; // Vs. private int age;
	
	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created.");
	}
	
	public void eat() {
		System.out.println("An animal is eating.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();
		d.ruff();
		System.out.println(d.age);
		c.meow();
		System.out.println(c.age);
		a.eat();
		d.eat();
		c.eat();
		d.run();
		c.prance();
		
		// What happens if...
		// Dog o = new Animal(3);
		// Animal o = new Dog();
		
	}

}
