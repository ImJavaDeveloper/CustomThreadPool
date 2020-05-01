package com.java.custom.threadpool;

public class TestCustomThread {
	
	public static void main(String[] args) throws InterruptedException {
    	//create queue size - 3
    	//Number of threads - 4
        ThreadPool threadPool = new ThreadPool(3,4);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
            CustomTask task = new CustomTask(taskNumber);
            threadPool.submitTask(task);
        }
    }

}
