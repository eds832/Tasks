
package by.sardyka.pattern.creation.singleton;

public class NestedClassInitSingleton {
  
  private NestedClassInitSingleton () {
  }
  
  private static class SingletonHelper {
    
    private static final NestedClassInitSingleton INSTANCE = new NestedClassInitSingleton();
  }
  
  public static NestedClassInitSingleton getInstance () {
    return SingletonHelper.INSTANCE;
  }
}
