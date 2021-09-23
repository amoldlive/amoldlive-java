package com.hashmap.and.heap;

import java.util.HashMap;

public class FindRouteFromTickets {
	public static void main(String[] args) {

		HashMap<String, String> ticket = new HashMap<String, String>();
		ticket.put("Chennai", "Bangluru");
		ticket.put("Bombay", "Delhi");
		ticket.put("Goa", "Chennai");
		ticket.put("Delhi", "Goa");
		
		findRoute(ticket);
	}
	private static void findRoute(HashMap<String, String> ticketMap) {
		
		System.out.println(ticketMap);
		HashMap<String, Boolean> routeMap=new HashMap<>();
		
		/*all destination - false , starting source true*/
		for(String source:ticketMap.keySet()) {
			String destination=ticketMap.get(source);
			routeMap.put(destination, false);
			
			if(!routeMap.containsKey(source))
			routeMap.put(source, true);
		}
		
		
		
		/*finding starting point*/
		String startPoint="";
		for(String source:routeMap.keySet()) {
			if(routeMap.get(source)==true) {
				startPoint=source;
				break;
			}
		}
		
		

		while(true) {
			if(ticketMap.containsKey(startPoint)) {
				System.out.print(startPoint +" - > ");
				startPoint=ticketMap.get(startPoint);
			}
			else {
				System.out.print(startPoint+" . ");
				break;
			}
		}
		
		
		//System.out.println(routeMap);
	}
}
