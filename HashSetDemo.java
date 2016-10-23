package colltection.set.hashset;

import java.util.*;

public class HashSetDemo {

	/**
	 * 集合框架-collection-set-HashSet
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("java01");
		hs.add("java02");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");
		
		hs.remove("java04");
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			sop(i.next());
		}
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
