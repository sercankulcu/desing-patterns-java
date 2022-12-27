public class Singleton {
  // The single instance of the Singleton class
  private static Singleton instance;

  // Private constructor to prevent external instantiation
  private Singleton() {}

  // Factory method to return the single instance of the Singleton class
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
