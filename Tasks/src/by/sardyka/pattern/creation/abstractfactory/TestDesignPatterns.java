
package by.sardyka.pattern.creation.abstractfactory;

public class TestDesignPatterns {
  
  public static void main ( String [] args ) {
    testAbstractFactory();
  }
  
  private static void testAbstractFactory () {
    Computer pc = by.sardyka.pattern.creation.abstractfactory.ComputerFactory
	   .getComputer( new PCFactory( "2 GB", "500 GB", "2.4 GHz" ) );
    Computer server = by.sardyka.pattern.creation.abstractfactory.ComputerFactory
	   .getComputer( new ServerFactory( "16 GB", "1 TB", "2.9 GHz" ) );
    System.out.println( "AbstractFactory PC Config::" + pc );//AbstractFactory PC Config::RAM= 2 GB, HDD=500 GB, CPU=2.4 GHz
    System.out.println( "AbstractFactory Server Config::" + server );//AbstractFactory Server Config::RAM= 16 GB, HDD=1 TB, CPU=2.9 GHz
  }
}
