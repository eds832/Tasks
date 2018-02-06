
package by.sardyka.pattern.structural.composite;

public class Leaf implements Component {
  
  public void operation () {
    System.out.println( "Leaf -> Performing operation" );
  }
  
  public void add ( Component c ) {
    System.out.println( "Leaf -> add. Doing nothing" );
    // генерация исключения и return false (если метод
    // не void)
  }
  
  public void remove ( Component c ) {
    System.out.println( "Leaf -> remove. Doing nothing" );
    // генерация исключения и return false (если метод
    // не void)
  }
  
  public Object getChild ( int index ) {
    throw new UnsupportedOperationException();
  }
}
