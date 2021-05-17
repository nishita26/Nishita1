package seventeen_may;

import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		
		final PC pc=new PC();
		
		//create producer thread
		Thread t1=new Thread(new Runnable() 
		{
			
			public void run() 
			{
				try 
				{
					pc.produce();
				}
				catch(InterruptedException e)
				{
						e.printStackTrace();
				}
			}
		});
		
		//create consumer thread
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					pc.consume();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		});		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

	public static class PC
	{
		LinkedList<Integer> ll=new LinkedList<>();
		int n=2;
		
		public void produce() throws InterruptedException{
			 int value = 0;
			 while(true) {
				 synchronized(this) {
					 while(ll.size()==n)
						 wait();
					 System.out.println("Producer produced "+value);
					 ll.add(value++);
					 notify();
					 Thread.sleep(1000);
				 }
			 }
		}
		
		public void consume() throws InterruptedException{
			 
			 while(true) {
				 synchronized(this) {
					 while(ll.size()==0)
						 wait();
					 int val=ll.removeFirst();
					 System.out.println("Consumer consumed "+val);
					 notify();
					 Thread.sleep(1000);
				 }
			 }
		}	
	}
}
