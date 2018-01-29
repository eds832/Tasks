
package by.sardyka.pattern.creation.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
  
  public static void main ( String [] args ) {
    SimpleSingleton instanceOne = SimpleSingleton.getInstance();
    SimpleSingleton instanceTwo = null;
    try {
	 @ SuppressWarnings ( "rawtypes" )
	 Constructor [] constructors = SimpleSingleton.class.getDeclaredConstructors();
	 for ( @ SuppressWarnings ( "rawtypes" ) Constructor constructor : constructors ) {
	   // Below code will destroy the singleton pattern
	   constructor.setAccessible( true );
	   instanceTwo = (SimpleSingleton) constructor.newInstance();
	   break;
	 }
    } catch ( Exception e ) {
	 e.printStackTrace();
    }
    System.out.println( instanceOne.hashCode() );
    System.out.println( instanceTwo.hashCode() );
  }
}
