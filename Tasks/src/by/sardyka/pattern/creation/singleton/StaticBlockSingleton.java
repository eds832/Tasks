
package by.sardyka.pattern.creation.singleton;

public class StaticBlockSingleton {
  
  private final static StaticBlockSingleton INSTANCE;
  
  private StaticBlockSingleton () {
  }
  
  // static block initialization for exception
  // handling
  static {
    try {
	 INSTANCE = new StaticBlockSingleton();
    } catch ( Exception e ) {
	 throw new RuntimeException( "Exception occured in creating singleton instance" );
    }
  }
  
  public static StaticBlockSingleton getInstance () {
    return INSTANCE;
  }
}
