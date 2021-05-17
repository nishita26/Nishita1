package seventeen_may;

import java.util.Scanner;

public class CreateMultiThread implements Runnable{
	
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
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
			
			CreateMultiThread cmt=new CreateMultiThread();
			Thread t1=new Thread(cmt);
			t1.start();
		}
		in.close();
	}
}
