package com.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {
	public static void main(String []args)
	{
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add("kalyan");
		ArrayList l=new ArrayList();
	    l.add("kalyan");
	    l.add("deepak");
	    al.addAllAbsent(l);
	    System.out.println(al);
		
	}

}
