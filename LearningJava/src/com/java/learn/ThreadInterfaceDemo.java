package com.java.learn;


public class ThreadInterfaceDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread( () ->
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Hi");
				try{ Thread.sleep(1000); } catch(Exception e){}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=0;i<=5;i++)
			{
				System.out.println("Hello");
				try{ Thread.sleep(1000); } catch(Exception e){}
			}
		});

		t1.start();
		try{ Thread.sleep(10); } catch(Exception e){}
		t2.start();
		
		t1.join(); // will make main thread to wait for
		t2.join();
		
		System.out.println("bye");
	}

}
