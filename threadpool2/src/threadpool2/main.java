package threadpool2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import threadpools.WorkerThread;

public class main {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
            Myclass obj= new Myclass("" + i);  
			executor.execute(obj);

		}
		executor.shutdown();
		while(!executor.isTerminated())
		{
			System.out.println("\n all tasks are finshied");
		}

	}

}
