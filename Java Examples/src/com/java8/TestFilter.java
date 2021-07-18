package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Amol");
		list.add("Dipmol");
		list.add("Dipalini");
		list.add("Rajat");
		list.add("Golu");
		
		List<String> filterList=list.stream().filter(name->name.contains("A") || name.contains("a")).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(filterList);
		System.out.println(filterList);
		System.out.println(filterList);
		
		List<String> filterList2=list.stream().filter(name->isContainsA(name)).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	
		Stream<String> s=list.stream();
		System.out.println(s);
		System.out.println(s);
		
		
		List<Integer> intList=new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		//System.out.println(isPrime(4));
		
		List<Integer> primeList= intList.stream().filter(num->isPrime(num)).collect(Collectors.toList());
		
		System.out.println(primeList);
		
		//why 1 is not prime
		/*
		 product of prime number with other number provides unique number.
		 
		 1*2=2   1*1*2=2
		 
		 2*2=4   2*2*2=8
		 
		 that is the reason 1 is not  prime number
		 
		 */
		
		filterTest();
	}
	private static void filterTest() {
		List<Integer> intList=new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		intList.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
		
		}).forEach(i->System.out.print(i+" "));;
	
	}
	public static boolean isPrime(int num) {
		
		
		int i=1;
		int count=0;
		
		while(i<=num) {
			if(num%i==0)
			count++;
			
			i++;
		}
		
		if(count==2)
			return true;
		
		return false;
	}
	public static boolean isContainsA(String name) {
		if(name.contains("A"))
			return true;
		
		return false;
	}
}
