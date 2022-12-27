import java.util.HashMap;
import java.util.Map;

interface Flyweight {
  void operation(int extrinsicState);
}

class ConcreteFlyweight implements Flyweight {
  private int intrinsicState;

  public ConcreteFlyweight(int intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  @Override
  public void operation(int extrinsicState) {
    System.out.println("Intrinsic State: " + intrinsicState + ", Extrinsic State: " + extrinsicState);
  }
}

public class FlyweightFactory {
  private Map<Integer, Flyweight> flyweights = new HashMap<>();

  public Flyweight getFlyweight(int intrinsicState) {
    Flyweight flyweight = flyweights.get(intrinsicState);
    if (flyweight == null) {
      flyweight = new ConcreteFlyweight(intrinsicState);
      flyweights.put(intrinsicState, flyweight);
    }
    return flyweight;
  }
  
  public static void main(String[] args)
  {
  	FlyweightFactory flyweightFactory = new FlyweightFactory();

  	Flyweight flyweight1 = flyweightFactory.getFlyweight(1);
  	flyweight1.operation(2);
  }
}
