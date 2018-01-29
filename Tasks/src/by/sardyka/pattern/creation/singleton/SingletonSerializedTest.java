
package by.sardyka.pattern.creation.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class SingletonSerializedTest {
  
  public static void main ( String [] args ) throws FileNotFoundException , IOException , ClassNotFoundException {
    SimpleSingleton instanceOne = SimpleSingleton.getInstance();
    ObjectOutput out = new ObjectOutputStream( new FileOutputStream( "data.obj" ) );
    out.writeObject( instanceOne );
    out.close();
    // deserailize from file to object
    ObjectInput in = new ObjectInputStream( new FileInputStream( "data.obj" ) );
    SimpleSingleton instanceTwo = (SimpleSingleton) in.readObject();
    in.close();
    System.out.println( "instanceOne hashCode=" + instanceOne.hashCode() );
    System.out.println( "instanceTwo hashCode=" + instanceTwo.hashCode() );
  }
}
