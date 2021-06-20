package test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import comparator.MyComparator;
import entity.Employee;
import task.ConsumerTask;
import task.ProducerTask;

public class Test {

	public static void main(String[] args) {
		//Natural
		//Non-Natural
		BlockingQueue<Employee> blockingQueue = new PriorityBlockingQueue<>(10, new MyComparator());
		
		blockingQueue.add(null);
		
		new Thread(new ProducerTask(blockingQueue)).start();
		new Thread(new ConsumerTask(blockingQueue)).start();
	}

}
