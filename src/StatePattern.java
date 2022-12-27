interface State {
  void handle();
}

class ConcreteStateA implements State {
  @Override
  public void handle() {
    System.out.println("Handling in ConcreteStateA");
  }
}

class ConcreteStateB implements State {
  @Override
  public void handle() {
    System.out.println("Handling in ConcreteStateB");
  }
}

class Context {
  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public void handle() {
    state.handle();
  }
}

public class StatePattern {
  public static void main(String[] args) {
    Context context = new Context();
    context.setState(new ConcreteStateA());
    context.handle();
    context.setState(new ConcreteStateB());
    context.handle();
  }
}
