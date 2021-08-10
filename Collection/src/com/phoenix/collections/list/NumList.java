package com.phoenix.collections.list;

/*Author: dhruvi.sha1@stltech.in
 * Version: 2.0
 * CopyRight: Sterlite Technologies Ltd.
 * Date: 14-Jul-2021
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(120);
		numList.add(150);
		numList.add(90);
		numList.add(20);
		numList.add(120);
		numList.add(100);
		
		System.out.println("Using for Loop");
		//iterating over list
		for(int i=0;i<numList.size();i++) {
			int ele = numList.get(i);
			System.out.println(ele);
		}
		System.out.println("---------------------------");
		System.out.println("Using iterator");
		Iterator<Integer> it = numList.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
		}
		System.out.println("---------------------------");
		System.out.println("Using for each loop");
		for(int ele : numList) {
			System.out.println(ele);
		}
		
		System.out.println("---------------------------");
		System.out.println(numList);
		
		System.out.println("---------------------------");
		Collections.sort(numList);
		System.out.println("Sorted List");
		for(int ele : numList) {
			System.out.println(ele);
		}
				
		System.out.println("---------------------------");
		Collections.reverse(numList);
		System.out.println("Reverse list using for each loop");
		for(int ele : numList) {
			System.out.println(ele);
		}
	}
}
