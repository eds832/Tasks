package by.sardyka.test.task;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Managers {
  
  public static void main ( String [] args ) {
    ArrayList<Person> list = new ArrayList<>();
    list.add( new Person("A", false) );
    list.add( new Person("B", true) );
    list.add( new Person("C", false) );
    list.add( new Person("D", false) );
    list.add( new Person("E", false) );
    list.add( new Person("F", true) );
    list.add( new Person("G", false) );
    list.add( new Person("K", false) );
    System.out.println(findManagersNames(list));
    System.out.println(findManagersNamesUsingSteams(list));
  }

  private static ArrayList<String> findManagersNamesUsingSteams ( ArrayList <Person> list ) {
    List<String> names = list.stream().filter(Person::isManager)
	   .map(Person::getName).collect(Collectors.toList());
    return new ArrayList<String>(names);
  }

  private static ArrayList<String> findManagersNames ( ArrayList <Person> list ) {
    ArrayList<String> names = new ArrayList<>();
    for(int i = 0; i < list.size(); i++) {
	 if(list.get( i ).isManager()) { names.add( list.get( i ).getName() ); }
    }
    return names;
  }
  
}

class Person {
  private String name;
  private boolean manager;
  Person(String name, boolean manager) { this.name = name; this.manager = manager; }
  public String getName() { return name; }
  public boolean isManager() { return manager; }
}