package com.ConcurrentHashMap;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoMethodCOWHM {
//new Methods availble on ConncurrentHashMap
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String []args)
	{
     ConcurrentHashMap m=new ConcurrentHashMap();
     m.put("1", "kalyan");
     m.put(2, "deepak");
     m.put(3, "Rock");
     m.putIfAbsent(4, "Mahi");
     m.putIfAbsent(3, "Rock");//it will not add bcz its already exists.
     m.remove(3,"sjgjnsdf");// it wont remove 3 key entry bcz  key and value both should matched
                            // this is the special method of Concurrent HashMap.
     System.out.println(m);
		
		
		
	}
}
