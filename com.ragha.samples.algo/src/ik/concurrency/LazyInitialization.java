package IK.concurrency;

public class LazyInitialization {
private static boolean initialized = false;

		Thread t = new Thread(new Runnable(){
			public void run(){
				initialized = true;
			}
		});
		
		static{	
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			throw new AssertionError();
		}
		
	}

	//Alternate way of main to avoid deadlock
	public static void main(String[] args) {
	try {
		t.join();
	} catch (Exception e) {
		// TODO: handle exception
	}
		System.out.println(initialized);
		
	}
	

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(initialized);
		
		
	}
*/
}
