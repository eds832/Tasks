package by.sardyka.test.task;

public class DeadLock {
  
  public static void main ( String [] args ) {
    Object a = new Object();
    Thread t = new Thread() {
	 
	 public void run () {
	   synchronized ( a ) {
		try {
		  a.wait();
		} catch ( InterruptedException e ) {
		  e.printStackTrace();
		}
		if ( !interrupted() ) {
		  a.notify();
		}
	   }
	 }
    };
    Thread th = new Thread() {
	 
	 public void run () {
	   synchronized ( a ) {
		try {
		  a.wait();
		} catch ( InterruptedException e ) {
		  e.printStackTrace();
		}
		if ( !interrupted() ) {
		  a.notify();
		}
	   }
	 }
    };
    t.start();
    th.start();
    try {
	 Thread.sleep( 2000 );
    } catch ( InterruptedException e ) {
	 e.printStackTrace();
    }
    t.interrupt();//to go out from deadlock
  }
  
}
