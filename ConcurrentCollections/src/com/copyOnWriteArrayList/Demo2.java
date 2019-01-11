package com.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class Demo2 {
	public static void main(String []args)
	{
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add("kalyan");
		al.addIfAbsent("Deepak");
		al.add("Mahi");
		al.addIfAbsent("kalyan");
		 Iterator it=al.iterator();
		 while(it.hasNext())
		 {
			 String s=(String)it.next();
			 if(s.equals("kalyan")){it.remove();}
			 System.out.println(s);
		 }
		
	}


}
