interface Expression {
  int interpret();
}

class NumberExpression implements Expression {
  private int number;

  public NumberExpression(int number) {
    this.number = number;
  }

  @Override
  public int interpret() {
    return number;
  }
}

class AdditionExpression implements Expression {
  private Expression leftExpression;
  private Expression rightExpression;

  public AdditionExpression(Expression leftExpression, Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }
}

class SubtractionExpression implements Expression {
  private Expression leftExpression;
  private Expression rightExpression;

  public SubtractionExpression(Expression leftExpression, Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() - rightExpression.interpret();
  }
}

public class Interpreter {
  public static void main(String[] args) {
    Expression expression = new AdditionExpression(
      new NumberExpression(10),
      new NumberExpression(20)
    );
    int result = expression.interpret();
    System.out.println("Result: " + result);
    
    expression = new SubtractionExpression(
        new NumberExpression(10),
        new NumberExpression(20)
      );
    result = expression.interpret();
    System.out.println("Result: " + result);
  }
}
