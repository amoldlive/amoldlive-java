package design.pattern;

interface Animal {
}

class Cat implements Animal {
	String name = "Cat-Kiten";
	int id = 1;
	String voice = "meow meow";

	@Override
	public String toString() {
		return "Cat [name=" + name + ", id=" + id + ", voice=" + voice + "]";
	}

}

class Dog implements Animal {
	String name = "Dog-Puppy";
	int id = 2;
	String voice = "bhow bhow";

	@Override
	public String toString() {
		return "Dog [name=" + name + ", id=" + id + ", voice=" + voice + "]";
	}

}

class AnimalFactory {
	public static Animal getInstance(String animal) {
		if (animal.equalsIgnoreCase("cat"))
			return new Cat();
		else
			return new Dog();
	}
}

public class FactoryPattern {
	public static void main(String[] args) {
		
			Animal cat=AnimalFactory.getInstance("cat");
			System.out.println(cat);
	}
}
