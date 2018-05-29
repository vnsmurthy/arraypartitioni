package reversewordsinstring;

public class Solution {
	
	public static String reverseString (String s) {
		char[] letters = s.toCharArray();
		int strLength = s.length();
        for (int i = 0; i < strLength/2; i++) {
        	char t = letters[i];
        	letters[i] = letters[strLength - 1 - i]; 
        	letters[strLength - 1 - i] = t;
        }
       String n = new String(letters);
       return n;
	}
	
	public static void main(String args[]) {
		String sent = "Brick in the wall";
		String result = "";
		String[] words = sent.split(" ");
		for (String w : words) {
			String p = reverseString(w);
			result = result + p + " ";
		}
		result = result.trim();
		System.out.println(result);
	}

}
