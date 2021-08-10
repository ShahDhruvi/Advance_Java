package com.phoenix.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Long> actorPhMap = new HashMap<String,Long>();
		actorPhMap.put("Varun Dhawan", 9856473589L);
		actorPhMap.put("Alia Bhatt", 9587469128L);
		actorPhMap.put("Deepika Padukone", 7984567986L);
		actorPhMap.put("Akshay Kumar", 4043527895L);
		actorPhMap.put("Sharadha Kapoor", 9858793654L);
	
		System.out.println("Phone NUmber of Varun Dhawan: "+actorPhMap.get("Varun Dhawan"));
		
		System.out.println(actorPhMap);
		
		//using iterator
		Set<String> actors = actorPhMap.keySet();
		Iterator<String> it = actors.iterator();
		while(it.hasNext()) {
			String actorName = it.next();
			long phoneNo = actorPhMap.get(actorName);
			System.out.println("Actor: " + actorName + "\tPhone No.: " + phoneNo);
		}
	}
}
