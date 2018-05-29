package problem806;

public class Solution {
	
	
	public static void main(String args[]) {
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		//String s = "bbbcccdddaaa";
		String s = "abcdefghijklmnopqrstuvwxyz";
		int sum = 0;
		int newLine = 0;
		if (s.isEmpty()) {
			newLine = 0;
		} else {
			newLine = 1;
		}
		for (char w : s.toCharArray()) {
			sum = sum + widths[w - 97];
			if (sum == 100) {
				sum = 0;
				newLine = newLine + 1;
			} else if (sum > 100) {
				sum = widths[w - 97];
				newLine = newLine + 1;
			}
		}
		System.out.println("[" + newLine + "," + sum + "]");
	}

}
