package task;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerTask implements Runnable {
	// Shared Resource
	BlockingQueue<Integer> blockingQueue = null;

	public ProducerTask(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		Random random = new Random();
		int value;
		for (int i = 1; i <= 10; i++) {
			try {
				value = random.nextInt(15);
				System.out.println("Producing and adding to Blocking Queue : " + value);
				blockingQueue.put(value);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {// put(o): Blocking Method
				e.printStackTrace();
			}
		}
	}

}
