interface Handler {
  void setNext(Handler handler);
  void handleRequest(int request);
}

class ConcreteHandlerA implements Handler {
  private Handler next;

  @Override
  public void setNext(Handler handler) {
    next = handler;
  }

  @Override
  public void handleRequest(int request) {
    if (request % 2 == 0) {
      System.out.println("ConcreteHandlerA handled request " + request);
    } else {
      next.handleRequest(request);
    }
  }
}

class ConcreteHandlerB implements Handler {
  private Handler next;

  @Override
  public void setNext(Handler handler) {
    next = handler;
  }

  @Override
  public void handleRequest(int request) {
    if (request % 3 == 0) {
      System.out.println("ConcreteHandlerB handled request " + request);
    } else {
      next.handleRequest(request);
    }
  }
}

class ConcreteHandlerC implements Handler {
  private Handler next;

  @Override
  public void setNext(Handler handler) {
    next = handler;
  }

  @Override
  public void handleRequest(int request) {
    if (request % 5 == 0) {
      System.out.println("ConcreteHandlerC handled request " + request);
    } else {
      next.handleRequest(request);
    }
  }
}

public class ChainofResponsibility {
  public static void main(String[] args) {
    Handler handlerA = new ConcreteHandlerA();
    Handler handlerB = new ConcreteHandlerB();
    Handler handlerC = new ConcreteHandlerC();
    handlerA.setNext(handlerB);
    handlerB.setNext(handlerC);

    handlerA.handleRequest(2);
    handlerA.handleRequest(3);
    handlerA.handleRequest(4);
    handlerA.handleRequest(5);
    handlerA.handleRequest(6);
  }
}
