package seventeen_may;

import java.util.Scanner;

 public class StopThread implements Runnable {
	
	public void run() 
	{
		try {
			while(true) {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
			Thread.sleep(400);
			}
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of threads:");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			
			StopThread st=new StopThread();
			Thread t1=new Thread(st);
			t1.start();
		}
		in.close();
	}
}