interface Color {
  void applyColor();
}

class RedColor implements Color {
  @Override
  public void applyColor() {
    System.out.println("Applying red color");
  }
}

class GreenColor implements Color {
  @Override
  public void applyColor() {
    System.out.println("Applying green color");
  }
}

abstract class ShapeBridge {
  protected Color color;

  public ShapeBridge(Color color) {
    this.color = color;
  }

  public abstract void drawShape();
  public abstract void modifyBorder(int border, Color color);
}

class Triangle extends ShapeBridge {
  public Triangle(Color color) {
    super(color);
  }

  @Override
  public void drawShape() {
    System.out.print("Drawing Triangle with color ");
    color.applyColor();
  }

  @Override
  public void modifyBorder(int border, Color color) {
    System.out.println("Modifying the border length " + border + " and color " + color);
  }
}

class RectangleBridge extends ShapeBridge {
  public RectangleBridge(Color color) {
    super(color);
  }

  @Override
  public void drawShape() {
    System.out.print("Drawing Rectangle with color ");
    color.applyColor();
  }

  @Override
  public void modifyBorder(int border, Color color) {
    System.out.println("Modifying the border length " + border + " and color " + color);
  }
}

public class Bridge {
  public static void main(String[] args)
  {
  	ShapeBridge triangle = new Triangle(new RedColor());
  	triangle.drawShape();
  	triangle.modifyBorder(20, new GreenColor());

  	ShapeBridge rectangle = new RectangleBridge(new GreenColor());
  	rectangle.drawShape();
  	rectangle.modifyBorder(40, new RedColor());

  }
}
