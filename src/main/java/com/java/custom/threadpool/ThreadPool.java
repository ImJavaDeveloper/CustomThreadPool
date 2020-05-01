package com.java.custom.threadpool;

public class ThreadPool {

	BlockingQueue<Runnable> queue;
	
	public ThreadPool(int queueSize,int noOfThread)
	{
		queue=new BlockingQueue<Runnable>(queueSize);
		String threadName=null;
		TaskExecutor taskExecutor=null;
		for(int i=0;i<noOfThread;i++)
		{
			threadName = "Thread-"+i;
			taskExecutor=new TaskExecutor(queue);
			Thread thread=new Thread(taskExecutor,threadName);
			thread.start();
		}
	}
	
	public void submitTask(Runnable task) throws InterruptedException 
	{
		queue.enqueue(task);
	}
}
