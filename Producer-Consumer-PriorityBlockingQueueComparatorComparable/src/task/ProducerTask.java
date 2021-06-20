package task;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import entity.Employee;

public class ProducerTask implements Runnable {
	// Shared Resource
	BlockingQueue<Employee> blockingQueue = null;

	public ProducerTask(BlockingQueue<Employee> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		Random random = new Random();
		Employee employee=null;
		int id;
		for (int i = 1; i <= 10; i++) {
			try {
				id = random.nextInt(10);
				employee = new Employee(id);
				System.out.println("Producing and adding employee to Blocking Queue : " + employee);
				blockingQueue.put(employee);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {// put(o): Blocking Method
				e.printStackTrace();
			}
		}
	}

}
