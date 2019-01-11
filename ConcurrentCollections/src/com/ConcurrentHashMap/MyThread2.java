package com.ConcurrentHashMap;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class MyThread2 extends Thread
{
static CopyOnWriteArrayList l=new CopyOnWriteArrayList();

  @Override
  public void run()
   {
	try{
		Thread.sleep(2000);
	}
	catch(InterruptedException e){}
	System.out.println("Child Thread is trying to Update the ConcurrentCollection");
	l.add("C");
   }
  
  public static void main(String []args)
  {
	  l.add("A");
	  l.add("B");
	  MyThread2 t=new MyThread2();
	  t.start();
	  Iterator it=l.iterator();
	  while(it.hasNext())
	  {
		  String s=(String)it.next();

		  System.out.println("Main Thread is Iterating ConcurrentCollection Current Object is"+s);
		  try
		  {
			Thread.sleep(3000);  
			  
		  }
		  catch(Exception e){}
		  
	  }
	  System.out.println(l);
  }
	

}
