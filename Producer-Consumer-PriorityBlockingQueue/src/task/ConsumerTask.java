package task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConsumerTask implements Runnable {
	// Shared Resource
	BlockingQueue<Integer> blockingQueue = null;

	public ConsumerTask(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		int consumedValue;
		for (int i = 1; i <= 10; i++) {
			try {
				consumedValue = blockingQueue.take();
				System.out.println("Consuming head element from Blocking Queue : " + consumedValue);
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {// take(): Blocking Method
				e.printStackTrace();
			}
		}
	}

}
