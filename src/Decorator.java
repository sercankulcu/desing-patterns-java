interface CarDecorator {
  void assemble();
}

class BasicCar implements CarDecorator {
  @Override
  public void assemble() {
    System.out.print("Basic car.");
  }
}

public abstract class Decorator implements CarDecorator {
  protected CarDecorator car;

  public Decorator(CarDecorator car) {
    this.car = car;
  }

  @Override
  public void assemble() {
    this.car.assemble();
  }
  
  public static void main(String[] args)
  {
  	CarDecorator sportsCar = new SportsCar(new BasicCar());
  	sportsCar.assemble();

  	CarDecorator luxuryCar = new LuxuryCar(new BasicCar());
  	luxuryCar.assemble();

  }
}

class SportsCar extends Decorator {
  public SportsCar(CarDecorator car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Sports Car.");
  }
}

class LuxuryCar extends Decorator {
  public LuxuryCar(CarDecorator car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Luxury Car.");
  }
}

