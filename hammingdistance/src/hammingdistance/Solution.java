package hammingdistance;

public class Solution {

	int hammingDistance(int x, int y) {
		int d = 0;
		int b = x ^ y;
        String s = Integer.toBinaryString(b);
        //also have a java bit count function in Integer class
        for (char c : s.toCharArray()) {
        	if (c == '1') {
        		d++;
        	}
        }
		return d;
	}

	
	public static void main(String args[]) {
		
		Solution s = new Solution();
		int d = s.hammingDistance(5, 8);
		System.out.println(d);
	}

}


