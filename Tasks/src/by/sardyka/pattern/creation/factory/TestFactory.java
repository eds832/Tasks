
package by.sardyka.pattern.creation.factory;

public class TestFactory {
  
  public static void main ( String [] args ) {
    Computer pc = ComputerFactory.getComputer( "pc", "2 GB", "500GB", "2.4 GHz" );
    Computer server = ComputerFactory.getComputer( "server", "16GB", "1 TB", "2.9 GHz" );
    System.out.println( "Factory PC Config::" + pc );//Factory PC Config::RAM= 2 GB, HDD=500GB, CPU=2.4 GHz
    System.out.println( "Factory Server Config::" + server );//Factory Server Config::RAM= 16GB, HDD=1 TB, CPU=2.9 GHz
  }
}
