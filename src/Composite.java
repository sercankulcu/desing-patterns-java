import java.util.ArrayList;
import java.util.List;

interface Component {
  void add(Component component);
  void remove(Component component);
  Component getChild(int index);
  void operation();
}

class Leaf implements Component {
  @Override
  public void add(Component component) {
    // this operation is not supported for leaf nodes
  }

  @Override
  public void remove(Component component) {
    // this operation is not supported for leaf nodes
  }

  @Override
  public Component getChild(int index) {
    // this operation is not supported for leaf nodes
    return null;
  }

  @Override
  public void operation() {
    // code to perform the operation for a leaf node
  }
}

public class Composite implements Component {
  private List<Component> components = new ArrayList<>();

  @Override
  public void add(Component component) {
    components.add(component);
  }

  @Override
  public void remove(Component component) {
    components.remove(component);
  }

  @Override
  public Component getChild(int index) {
    return components.get(index);
  }

  @Override
  public void operation() {
    // code to perform the operation for a composite node
    for (Component component : components) {
      component.operation();
    }
  }
  
  public static void main(String[] args)
  {
  	Component leaf1 = new Leaf();
  	Component leaf2 = new Leaf();

  	Component composite = new Composite();
  	composite.add(leaf1);
  	composite.add(leaf2);

  	composite.operation();
  }
}

