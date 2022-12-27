interface Visitor {
  void visit(Element element);
}

interface Element {
  void accept(Visitor visitor);
}

class ConcreteElementA implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}

class ConcreteElementB implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}

class ConcreteVisitorA implements Visitor {
  @Override
  public void visit(Element element) {
    System.out.println("Visiting " + element.getClass().getSimpleName() + " with ConcreteVisitorA");
  }
}

class ConcreteVisitorB implements Visitor {
  @Override
  public void visit(Element element) {
    System.out.println("Visiting " + element.getClass().getSimpleName() + " with ConcreteVisitorB");
  }
}

public class VisitorPattern {
  public static void main(String[] args) {
    Element elementA = new ConcreteElementA();
    Element elementB = new ConcreteElementB();
    Visitor visitorA = new ConcreteVisitorA();
    Visitor visitorB = new ConcreteVisitorB();
    elementA.accept(visitorA);
    elementA.accept(visitorB);
    elementB.accept(visitorA);
    elementB.accept(visitorB);
  }
}

