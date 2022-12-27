interface Subject {
  void request();
}

class RealSubject implements Subject {
  @Override
  public void request() {
    System.out.println("Handling request.");
  }
}

public class Proxy implements Subject {
  private Subject subject;

  public Proxy(Subject subject) {
    this.subject = subject;
  }

  @Override
  public void request() {
    System.out.println("Before handling request.");
    subject.request();
    System.out.println("After handling request.");
  }
  
  public static void main(String[] args)
  {
  	Subject subject = new Proxy(new RealSubject());
  	subject.request();
  }
}
