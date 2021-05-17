package seventeen_may;

public class CreateThread implements Runnable {
	
	public void run() {
		System.out.println("Thread has ended.");
	}

	public static void main(String[] args) {
		
		CreateThread ct=new CreateThread();
		Thread t=new Thread(ct);
		t.start();
		System.out.println("Thread is ruuning.");
		
		
	}

}
