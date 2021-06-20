package task;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import entity.Employee;

public class ConsumerTask implements Runnable {
	// Shared Resource
	BlockingQueue<Employee> blockingQueue = null;

	public ConsumerTask(BlockingQueue<Employee> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		Employee employee = null;
		for (int i = 1; i <= 10; i++) {
			try {
				employee = blockingQueue.take();
				System.out.println("Consuming head employee from Blocking Queue : " + employee);
				TimeUnit.SECONDS.sleep(15);
			} catch (InterruptedException e) {// take(): Blocking Method
				e.printStackTrace();
			}
		}
	}

}
