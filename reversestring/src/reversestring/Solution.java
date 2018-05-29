package reversestring;

public class Solution {
	
	public static void main(String args[]) {
		String s = "divya";
		char[] letters = s.toCharArray();
		int strLength = s.length();
        for (int i = 0; i < strLength/2; i++) {
        	char t = letters[i];
        	letters[i] = letters[strLength - 1 - i]; 
        	letters[strLength - 1 - i] = t;
        }
       String n = new String(letters);
       System.out.println(n);		
	}

}
