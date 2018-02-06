package by.sardyka.test.task;


public class Dump {
  String variable;
  
  public static void main(String [] args) {
    System.out.println( "Hello World!" );//1 - > output: Hello World!
    Dumper d = new Dumper();
  }
  
  public Dump() {
    printVariable();//3 - base class init
  }
  
  protected void printVariable() {
    variable = "variable is initialized in Dump Class";//4 -> Dump.d = "variable is initialized in Dump Class"
  }
}

class Dumper extends Dump {
  String variable = null;
  
  public Dumper() {
    //2 -> super();
    //extended class init ->
    System.out.println("variable value = " + variable);//5 -> output: variable value = null 
  }
  
  protected void printVariable() {
    variable = "variable is initialized in Dumper Class";
  }
}