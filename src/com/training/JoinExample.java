package com.training;

import java.io.IOException;

public class JoinExample {
	
		public static void main(String[] args)
		{
			System.out.println("Main Started");
			Thread t =new Thread()
					{

						@Override
						public void run() {
							
							System.out.println("Reading");
							try {
								System.in.read();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							System.out.println("Finished Reading");
							// TODO Auto-generated method stub
							super.run();
						}
				
					};
		
		
		t.start();
		
		System.out.println("is it a live thread " + t.isAlive());
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("is it a live thread " + t.isAlive());
		t.start();
		System.out.println("Main Finished");
}
		}
