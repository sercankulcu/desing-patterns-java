
interface Shape {
  void draw();
}

class Circle implements Shape {
  @Override
  public void draw() {
    // Code to draw a circle
  }
}

class Rectangle implements Shape {
  @Override
  public void draw() {
    // Code to draw a rectangle
  }
}

public class Factory {
  // Factory method to create a shape
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    return null;
  }
  
  public static void main(String[] args)
  {
  	Factory shapeFactory = new Factory();

  	// Create a circle
  	Shape circle = shapeFactory.getShape("CIRCLE");
  	circle.draw();

  	// Create a rectangle
  	Shape rectangle = shapeFactory.getShape("RECTANGLE");
  	rectangle.draw();

  }
}
