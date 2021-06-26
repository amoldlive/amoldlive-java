package com.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		
		for(Integer i:l) {
			l.remove(0);
		}
		System.out.println("next : "+l);

		/* concurrentModificationExceoption
		 * 
		for(Integer i:l) {
			l.add(11);
		}
		System.out.println("next : "+l);
		*/
	
		//infinite for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			//l.add(11);  //makes infinite loop 
		}
		
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
			if(l.get(i)==2)
				l.remove(i);
		}
		
		System.out.println(l);
		
		
		
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3")) {}
				//myList.remove(value);  //throws exception
		}
		
		
		
		List<String> var=new ArrayList<String>();
	}
}
