package easy;

/*
A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.
		
*/

public class Problem_1 {
	public static final int SUM = 10;
	
	
	// Type -1 
	static int perfect(int n) {
		int value = SUM - n;
		int k = SUM - value; 
		if(value+k == SUM) {
			String p = String.valueOf(k)+String.valueOf(value);
			return Integer.valueOf(p);
		}
	   return value;	
	}
	
	
	// Type -2
	static int perfect_2(int n) {
		int value = SUM - n;
		int p = SUM - value ;
		int k = (SUM * p)+value;
	   return k;	
	}
	
	
	public static void main(String[] args) {
		int k = perfect_2(5);
		System.out.println(k);
		
	}

}
