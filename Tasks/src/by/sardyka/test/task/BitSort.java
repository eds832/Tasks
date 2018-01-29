package by.sardyka.test.task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class BitSort {
  
  public static void main ( String [] args ) {
    byte [] b = { 9, 5, 1, 2, 5, 3, 5, 3, 4, 5, 1, 6, 7, 3 };
    System.out.println( numberOfRepeats(b) );
    System.out.println( numberOfRepeatedItems(b) );
    System.out.println( numberOfRepeatedItemsStream(b) );
    System.out.println( numberOfRepeatedItemsStream2(b) );
  }

  private static long numberOfRepeatedItemsStream ( byte [] b ) {
    HashMap<Byte, Long> bytes = new HashMap<>();
    for(int i = 0; i < b.length; i++) {
	 bytes.merge(b[i], 1L, (biOld, biNew) -> (biOld + biNew));
    }
    return bytes.entrySet().stream().filter( o -> o.getValue() > 1L ).count();
  }

  private static long numberOfRepeatedItemsStream2 ( byte [] b ) {
    ArrayList<Byte> list = new ArrayList<>();
    for(byte by : b) {
	 list.add( by );
    }
    HashSet<Byte> set = new HashSet<>(list);
    return set.stream().peek( o -> list.remove(o) ).filter(o -> list.contains( o )).count();
  }
  private static long numberOfRepeatedItems ( byte [] b ) {
    Arrays.sort( b );
    HashSet<Byte> bytes = new HashSet<>();
    for(int i = 1; i < b.length; i++) {
	 if(b[i-1] == b[i]) {
	   bytes.add( b[i] );
	 }
    }
    return bytes.size();
  } 

  private static long numberOfRepeats ( byte [] b ) {
    Arrays.sort( b );
    long d = 0;
    for(int i = 1; i < b.length; i++) {
	 if(b[i-1] == b[i]) {
	   d++;
	 }
    }
    return d;
  } 
}
