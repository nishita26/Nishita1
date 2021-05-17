package seventeen_may;

public class DisplayThread extends Thread {
	
	DisplayThread(String threadName,ThreadGroup tg){
		super(tg,threadName);
		start();
	}
	
	public void run()
	{
		System.out.println("running thread name is: "+Thread.currentThread().getName());
	}

	public static void main(String[] args)
	{
		ThreadGroup tg=new ThreadGroup("parent thread group");
		DisplayThread t1=new DisplayThread("Thread-1",tg);
		DisplayThread t2=new DisplayThread("Thread-2",tg);
		
		System.out.println("Number of active thread: "+tg.activeCount());
		
	}

}
