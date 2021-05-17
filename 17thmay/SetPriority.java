package seventeen_may;

public class SetPriority extends Thread{
	
	public void run() {
		try {
			System.out.println(" Priority of Thread is "+Thread.currentThread().getPriority());
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		
		    SetPriority t1=new SetPriority();
		    SetPriority t2=new SetPriority();
		    SetPriority t3=new SetPriority();
		    SetPriority t4=new SetPriority();
			t1.setPriority(Thread.MAX_PRIORITY);
			t1.start();
			t2.setPriority(Thread.MIN_PRIORITY);
			t2.start();
			t3.setPriority(Thread.NORM_PRIORITY);
			t3.start();
			t4.setPriority(6);
			t4.start();
		}
		
	}
