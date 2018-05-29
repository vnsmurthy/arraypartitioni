package morsecode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	static final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
	static String getCode(String word) {
		StringBuilder build = new StringBuilder("");
		for (char c : word.toCharArray()) {
			build.append(morse[c- 'a']);
		}
		return build.toString();
		
	}
	
	public static void main(String args[]) {
		String[] words = {"gin", "zen", "gig", "msg"};
		Set<String> uniques = new HashSet<>();
		for (String w : words) {
			String code = getCode(w);
			uniques.add(code);
		}
		System.out.println(uniques);
	}
}
