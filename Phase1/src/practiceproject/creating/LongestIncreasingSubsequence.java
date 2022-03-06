package practiceproject.creating;

public class LongestIncreasingSubsequence {
	public static int LongestIncreasingSubsequence(int[] array, int i, int n, int prev)
	 {
	 if (i == n) {
	 return 0;
	 }
	 int exclude = LongestIncreasingSubsequence(array, i + 1, n, prev);
	 
	 int include = 0;
	 if (array[i] > prev) {
	 include = 1 + LongestIncreasingSubsequence(array, i + 1, n, array[i]);
	 }
	 
	 return Integer.max(include, exclude);
	 }
	 public static void main(String[] args)
	 {
	 int[] array = { 1, 5, 9, 18, 8, 15, 49, 24, 56, 26, 12,55,17 };
	 System.out.print("The length of the LongestIncreasingSubsequence is "
	 + LongestIncreasingSubsequence(array, 0, array.length, Integer.MIN_VALUE));
	 }
	}
