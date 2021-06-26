package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface Cook{
	public void cookFood();
}
public class LambdaTest {

	static Cook cook=() ->{System.out.println("Cooking food");	};
	Cook cook2=() ->{System.out.println("Cooking food");	};
	
	public static void main(String[] args) {
		cook.cookFood();  // static can access only static variables 
		//cook2.cookFood();
		
		List<String> l=new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.forEach((i)->System.out.println(i));
		
		List<String> l2=l.stream().filter(i->i=="A" || i=="B").collect(Collectors.toList());
		System.out.println(l2);
		Collections.sort(l2,Collections.reverseOrder());
		System.out.println(l2);
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		
		map.forEach((i,j)->System.out.println("Key "+i+" Value : "+j));
		
		
		List<Integer> intlist=new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		
		List<Integer> list=intlist.stream().filter(i->i%2==0).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		list.forEach(i->System.out.print(i+" "));
	}
	public void instance() {
		cook2.cookFood(); //non static can access static
		cook.cookFood();  // as well as non static
	}
}
