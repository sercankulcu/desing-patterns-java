interface Command {
  void execute();
}

class ConcreteCommand implements Command {
  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action();
  }
}

class Receiver {
  public void action() {
    System.out.println("Handling request.");
  }
}

class Invoker {
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void invoke() {
    command.execute();
  }
}

public class CommandPattern {
  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker(command);
    invoker.invoke();
  }
}

