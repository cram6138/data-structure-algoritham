package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService threadService = Executors.newFixedThreadPool(10);
		for (int i=0; i<10; i++) {
			threadService.execute(new workerThread());
		}
		threadService.shutdown();
		while (!threadService.isTerminated()) {
			System.out.println("All Threads have been ended.");
        }
	}

}

class workerThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Sart Of Thread :: " + Thread.currentThread().getName());
		System.out.println("End Of Thread :: " + Thread.currentThread().getName());
	}
	
}
