
package by.sardyka.pattern.creation.prototype;

import java.util.List;
import by.sardyka.pattern.creation.prototype.Employees;


class PrototypePatternTest {
  
  public static void main ( String [] args ) throws CloneNotSupportedException {
    Employees emps = new Employees();
    emps.loadData();
    // Use the clone method to get the Employee object
    Employees empsNew = (Employees) emps.clone();
    Employees empsNew1 = (Employees) emps.clone();
    List <String> list = empsNew.getEmpList();
    list.add( "John" );
    List <String> list1 = empsNew1.getEmpList();
    list1.remove( "Ben" );
    System.out.println( "empsNew List: " + list );//empsNew List: [Ben, John, Mark, Ed, John]
    System.out.println( "empsNew1 List: " + list1 );//empsNew1 List: [John, Mark, Ed]
    System.out.println( "emps List: " + emps.getEmpList() );//emps List: [Ben, John, Mark, Ed]
  }
}
