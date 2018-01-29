package by.sardyka.test.task;

public class DeadLock2 {
  
  public static void main ( String [] args ) {
    String s1 = "Dead";
    String s2 = "lock";
    new Thread() {
	 
	 public void run (){
	   synchronized ( s1 ) {
		try {
		  Thread.sleep( 100 );
		} catch ( InterruptedException e ) {
		 e.printStackTrace();
		}
		synchronized ( s2 ) {
		  System.out.println( s1 + s2 + " #1" );
		}
	   }
	 }
    }.start();
    new Thread() {
	 
	 public void run () {
	   synchronized ( s2 ) {
		try {
		  Thread.sleep( 100 );
		} catch ( InterruptedException e ) {
		 e.printStackTrace();
		}
		synchronized ( s1 ) {
		  System.out.println( s1 + s2 + " #2" );
		}
	   }
	 }
    }.start();
  } 
}
