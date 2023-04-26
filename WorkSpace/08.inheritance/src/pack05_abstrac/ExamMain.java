package pack05_abstrac;

public class ExamMain {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		
		Animal animal = new Cat();
		animal.sound();
		animal = new Dog();
		animal.sound();
		
	}

}
