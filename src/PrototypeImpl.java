interface Prototype {
  Prototype clone();
}

class ConcretePrototypeA implements Prototype {
  private String property;

  public ConcretePrototypeA(String property) {
    this.property = property;
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototypeA(property);
  }
}

class ConcretePrototypeB implements Prototype {
  private int property;

  public ConcretePrototypeB(int property) {
    this.property = property;
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototypeB(property);
  }
}

public class PrototypeImpl {
	public static void main(String[] args)
	{
		Prototype prototypeA = new ConcretePrototypeA("Hello");
		Prototype prototypeACopy = prototypeA.clone();

		Prototype prototypeB = new ConcretePrototypeB(123);
		Prototype prototypeBCopy = prototypeB.clone();
	}
}
