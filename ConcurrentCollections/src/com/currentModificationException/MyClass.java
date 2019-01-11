package com.currentModificationException;

import java.util.*;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;


public class MyClass extends Thread{
	static ArrayList<String> al=new ArrayList<String>();
	
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		
	    catch(InterruptedException e){}
	 System.out.println("Child thread trying to update the List ");
	 al.add("D");
	    
	}
	
	public static void main(String[] args) throws InterruptedException {
     al.add("A");
     al.add("B");
     al.add("C");
     MyClass mc=new MyClass();
     mc.start();
     
     Iterator it=al.iterator();
       
     while(it.hasNext())
     {
    	 String s=(String)it.next();
    	 System.out.println("Main Thread is Iterating On List Current Object is "+s);
    	 Thread.sleep(3000);
     }
     
		System.out.println(al);
	}

}
