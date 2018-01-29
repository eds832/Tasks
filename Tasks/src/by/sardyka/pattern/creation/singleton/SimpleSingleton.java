
package by.sardyka.pattern.creation.singleton;

import java.io.Serializable;

public class SimpleSingleton implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private static final SimpleSingleton INSTANCE = new SimpleSingleton();
  
  // private constructor to avoid client
  // applications to use constructor
  private SimpleSingleton () {
  }
  
  public static SimpleSingleton getInstance () {
    return INSTANCE;
  }
  //this method is to avoid obtaining new instance using serialization
  protected Object readResolve() {
    return getInstance();
    }
}
