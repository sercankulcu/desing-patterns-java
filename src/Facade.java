class ComplexSystem {
  public void method1() {
    // code to perform method 1 of the complex system
  }

  public void method2() {
    // code to perform method 2 of the complex system
  }

  public void method3() {
    // code to perform method 3 of the complex system
  }
}

public class Facade {
  private ComplexSystem complexSystem;

  public Facade(ComplexSystem complexSystem) {
    this.complexSystem = complexSystem;
  }

  public void methodA() {
    complexSystem.method1();
    complexSystem.method2();
  }

  public void methodB() {
    complexSystem.method2();
    complexSystem.method3();
  }
  
  public static void main(String[] args)
  {
  	ComplexSystem complexSystem = new ComplexSystem();
  	Facade facade = new Facade(complexSystem);

  	facade.methodA();
  	facade.methodB();
  }
}
