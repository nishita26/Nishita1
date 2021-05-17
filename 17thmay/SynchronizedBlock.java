package seventeen_may;

class Table
{
  void printTable(int n)
  {
	  synchronized(this)
	  {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	  }
  }
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		  final Table t=new Table();
		 
		 Thread t1=new Thread() {
			 public void run() {
				 t.printTable(5);
			 }
		 };
		 
		 Thread t2=new Thread() {
			 public void run() {
				 t.printTable(10);
			 }
		 };
		 t1.start();
		 t2.start();
	}

}
