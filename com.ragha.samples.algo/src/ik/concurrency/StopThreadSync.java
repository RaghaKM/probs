package IK.concurrency;

import java.util.concurrent.TimeUnit;

public class StopThreadSync {
public static boolean stopRequested;

	public static void main(String[] args) throws InterruptedException{
		
		Thread backgroundThrd = new Thread(new Runnable(){
			public void run(){
				int i=0;
				while(!stopRequested){
					i++;
				}
			}
		});
		backgroundThrd.start();

	TimeUnit.SECONDS.sleep(1);;
		stopRequested = true;
		
	}

}
