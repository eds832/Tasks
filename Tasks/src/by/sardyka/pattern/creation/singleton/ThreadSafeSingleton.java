
package by.sardyka.pattern.creation.singleton;

public class ThreadSafeSingleton {
  
  private static ThreadSafeSingleton instance;
  
  private ThreadSafeSingleton () {
  }
  
  public static synchronized ThreadSafeSingleton getInstance () {
    if ( instance == null ) {
	 instance = new ThreadSafeSingleton();
    }
    return instance;
  }
  //This method provides more performance - synchronization is used only if(instance == null) 
  public static ThreadSafeSingleton getInstanceUsingDoubleLocking () {
    if ( instance == null ) {
	 synchronized ( ThreadSafeSingleton.class ) {
	   if ( instance == null ) {
		instance = new ThreadSafeSingleton();
	   }
	 }
    }
    return instance;
  }
}
