abstract class AbstractClass {
  public final void templateMethod() {
    step1();
    step2();
    step3();
  }

  protected abstract void step1();
  protected abstract void step2();
  protected void step3() {
    System.out.println("Executing step 3 in AbstractClass");
  }
}

class ConcreteClassA extends AbstractClass {
  @Override
  protected void step1() {
    System.out.println("Executing step 1 in ConcreteClassA");
  }

  @Override
  protected void step2() {
    System.out.println("Executing step 2 in ConcreteClassA");
  }
}

class ConcreteClassB extends AbstractClass {
  @Override
  protected void step1() {
    System.out.println("Executing step 1 in ConcreteClassB");
  }

  @Override
  protected void step2() {
    System.out.println("Executing step 2 in ConcreteClassB");
  }

  @Override
  protected void step3() {
    System.out.println("Executing step 3 in ConcreteClassB");
  }
}

public class TemplateMethod {
  public static void main(String[] args) {
    AbstractClass a = new ConcreteClassA();
    a.templateMethod();
    AbstractClass b = new ConcreteClassB();
    b.templateMethod();
  }
}

