interface Animal {
  void speak();
}

class Dog implements Animal {
  @Override
  public void speak() {
    System.out.println("Woof!");
  }
}

class Cat implements Animal {
  @Override
  public void speak() {
    System.out.println("Meow!");
  }
}

interface AnimalFactory {
  Animal createAnimal();
}

class DogFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Dog();
  }
}

class CatFactory implements AnimalFactory {
  @Override
  public Animal createAnimal() {
    return new Cat();
  }
}

public class AbstractFactory {
	public static void main(String[] args)
	{
		AnimalFactory dogFactory = new DogFactory();
		Animal dog = dogFactory.createAnimal();
		dog.speak();

		AnimalFactory catFactory = new CatFactory();
		Animal cat = catFactory.createAnimal();
		cat.speak();

	}
}
