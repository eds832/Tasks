
package by.sardyka.pattern.structural.composite;

public class Client {
  
  private Component component;
  
  public Client ( Component component ) {
    this.component = component;
  }
  
  public void execute () {
    component.operation();
  }
}
