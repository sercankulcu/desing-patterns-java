import java.util.ArrayList;
import java.util.List;

interface Observer {
  void update(String state);
}

interface SubjectObserver {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}

class ConcreteObserver implements Observer {
  private String state;

  @Override
  public void update(String state) {
    this.state = state;
    System.out.println("Observer: state updated to " + state);
  }
}

class ConcreteSubject implements SubjectObserver {
  private List<Observer> observers = new ArrayList<>();
  private String state;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(state);
    }
  }

  public void setState(String state) {
    this.state = state;
    notifyObservers();
  }
}

public class ObserverPattern {
  public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();
    Observer observer1 = new ConcreteObserver();
    Observer observer2 = new ConcreteObserver();
    subject.registerObserver(observer1);
    subject.registerObserver(observer2);
    subject.setState("State 1");
    subject.setState("State 2");
  }
}
