package com.ConcurrentHashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread1  extends Thread{
	
	@SuppressWarnings("rawtypes")
	static HashMap m=new HashMap();
	@SuppressWarnings("unchecked")
	@Override
	public void run(){
		

		System.out.println("Child Thread is Updating Map");
		m.put(103, "c");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []args)
	{
		m.put(101, "A");
		m.put(102, "B");
		MyThread1 t=new MyThread1();
		//t.start();
		
		Set s=m.keySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Integer I=(Integer)it.next();
			System.out.println("Main Thread is Iterating Map and current Entry is "+I+".."+m.get(I));
	
		}
		//t.start();
		System.out.println(m);
		
		
	}

}
