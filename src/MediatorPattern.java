interface Mediator {
  void send(String message, Colleague colleague);
}

abstract class Colleague {
  private Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  public void send(String message) {
    mediator.send(message, this);
  }

  public abstract void receive(String message);
}

class ConcreteMediator implements Mediator {
  private Colleague colleague1;
  private Colleague colleague2;

  public void setColleague1(Colleague colleague1) {
    this.colleague1 = colleague1;
  }

  public void setColleague2(Colleague colleague2) {
    this.colleague2 = colleague2;
  }

  @Override
  public void send(String message, Colleague colleague) {
    if (colleague == colleague1) {
      colleague2.receive(message);
    } else {
      colleague1.receive(message);
    }
  }
}

class ConcreteColleague1 extends Colleague {
  public ConcreteColleague1(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void receive(String message) {
    System.out.println("Colleague1 received: " + message);
  }
}

class ConcreteColleague2 extends Colleague {
  public ConcreteColleague2(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void receive(String message) {
    System.out.println("Colleague2 received: " + message);
  }
}

public class MediatorPattern {
  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();
    Colleague colleague1 = new ConcreteColleague1(mediator);
    Colleague colleague2 = new ConcreteColleague2(mediator);
    ((ConcreteMediator) mediator).setColleague1(colleague1);
    ((ConcreteMediator) mediator).setColleague2(colleague2);
    colleague1.send("Hello, how are you?");
    colleague2.send("I'm fine, thank you. How about you?");
  }
}
