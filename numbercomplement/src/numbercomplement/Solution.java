package numbercomplement;

public class Solution {
	
	public static void main(String args[]) {
		int x = 2;
		int y = x;
		int complement = 0;
		while (y != 0) {
			complement = complement << 1;
			complement = complement | 1;
			y = y >> 1;
		}
		int result = complement ^ x;
		System.out.println(result);
		
	}

}
