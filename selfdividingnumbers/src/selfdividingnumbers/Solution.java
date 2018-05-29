package selfdividingnumbers;

public class Solution {
	
	boolean isASelfDividingNumber(int x) {
		if (x < 13) {
			return true;
		} else {
			String s = String.valueOf(x);
			for (char i : s.toCharArray()) {
				int divisor = Character.getNumericValue(i);
				if ((divisor != 0 && divisor != 1) && x%divisor != 0) {
					return false;
				} 
			}
			return true;
		}
	}
	
	public static void main(String args[]) {
		
		Solution solution = new Solution();
		int lower = 1;
		int upper = 22;
		
		for (int i = lower; i<=upper; i++) {
			if(solution.isASelfDividingNumber(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}
