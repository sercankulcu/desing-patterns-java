
class Car {
  private String make;
  private String model;
  private int year;
  private String color;
  private int horsepower;
  private int torque;

  private Car(CarBuilder builder) {
    this.make = builder.make;
    this.model = builder.model;
    this.year = builder.year;
    this.color = builder.color;
    this.horsepower = builder.horsepower;
    this.torque = builder.torque;
  }

  public static class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private int horsepower;
    private int torque;

    public CarBuilder setMake(String make) {
      this.make = make;
      return this;
    }

    public CarBuilder setModel(String model) {
      this.model = model;
      return this;
    }

    public CarBuilder setYear(int year) {
      this.year = year;
      return this;
    }

    public CarBuilder setColor(String color) {
      this.color = color;
      return this;
    }

    public CarBuilder setHorsepower(int horsepower) {
      this.horsepower = horsepower;
      return this;
    }

    public CarBuilder setTorque(int torque) {
      this.torque = torque;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }
}


public class Builder {
  public static void main(String[] args)
  {
  	Car car = new Car.CarBuilder()
        .setMake("Ford")
        .setModel("Mustang")
        .setYear(2020)
        .setColor("Red")
        .setHorsepower(450)
        .setTorque(420)
        .build();

  }
}
