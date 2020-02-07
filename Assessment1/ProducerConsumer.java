import java.util.LinkedList;

public class ExampleThread {
	public static void main(String args[]) throws InterruptedException
	{
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable(){
			
			public void run()
			{
				try{
					pc.produce();
				}
				catch(InterruptedException e){
					e.printStackTrace();
					
				}
			}
			
		});
		Thread t2 = new Thread(new Runnable(){
			public void run()
			{
				try{
					pc.produce();
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		});
		
		
		Thread t3 = new Thread(new Runnable(){
			public void run(){
				try{
					pc.consume();
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
		});
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}
	
	public static class PC{
		
		LinkedList<Integer> list = new LinkedList();
		int size = 3;
		
		public void produce() throws InterruptedException{
			int value = 0;
			while(true){
				synchronized(this){
					while(list.size() == size)
						wait();
					System.out.println("Producer produced -> "+ value + Thread.currentThread().getName());
					list.add(value++);
					notify();
					Thread.sleep(2000);
					
				}
			}
		}
		
		public void consume() throws InterruptedException{
			while(true){
				synchronized(this){
					while(list.size() == 0)
						wait();
					
					int val = list.removeFirst();
					System.out.println("Consumer consumed -> "+ val + Thread.currentThread().getName());
					notify();
					Thread.sleep(2000);
				}
			}
		}
		
	}
}
