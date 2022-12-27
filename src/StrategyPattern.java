interface Strategy {
  void execute();
}

class ConcreteStrategyA implements Strategy {
  @Override
  public void execute() {
    System.out.println("Executing in ConcreteStrategyA");
  }
}

class ConcreteStrategyB implements Strategy {
  @Override
  public void execute() {
    System.out.println("Executing in ConcreteStrategyB");
  }
}

class StrategyContext {
  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void execute() {
    strategy.execute();
  }
}

public class StrategyPattern {
  public static void main(String[] args) {
  	StrategyContext context = new StrategyContext();
    context.setStrategy(new ConcreteStrategyA());
    context.execute();
    context.setStrategy(new ConcreteStrategyB());
    context.execute();
  }
}
