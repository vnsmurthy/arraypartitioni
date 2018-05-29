package jewelsandstones;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class Solution {
	
	public void jewelsandstones(String s, String a) {
		char[] myCollection = a.toCharArray();
		char[] myJewels = s.toCharArray();
		int totalJewels = 0;
		Map<Character, Integer> myMap = new HashMap<>();
		for (char c : myCollection) {
			if (myMap.containsKey(c)) {
			    myMap.put(c, myMap.get(c) + 1);
			} else {
				myMap.put(c, 1);
			}			
		}
		
		for (char c : myJewels) {
			if (myMap.containsKey(c)) {
				totalJewels += myMap.get(c);
			}
		}		
		System.out.println(totalJewels);
	}
	
	public static void main(String args[]) {
		Solution sol = new Solution();
		String s = "zg";
		String a = "aAAAabbbbcs";
		sol.jewelsandstones(s, a);
		
	}

}
