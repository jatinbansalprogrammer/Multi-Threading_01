package test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import task.ConsumerTask;
import task.ProducerTask;

public class Test {

	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(10);
		
		new Thread(new ProducerTask(blockingQueue)).start();
		new Thread(new ConsumerTask(blockingQueue)).start();
	}

}
