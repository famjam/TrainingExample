package com.training;

public class UsePrintString implements Runnable {

	private String str1;

	private String str2;
	
	

	
	
	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	
		Thread t = new Thread(this);
		t.start();
		}

	public UsePrintString()
	{
		super();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

		PrintStrings.printString(str1, str2);
	}

}
