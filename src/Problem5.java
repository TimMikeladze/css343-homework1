public class Problem5 {
	
	public static boolean problem5(int[] input, int k) {
		boolean found = false;							// 1 unit
		int a = 0;										// 1 unit
		int b = input.length - 1;						// 2 unit
		for (int i = 0; i < input.length; i++) {		// 1 + (n+1) + n units
			int sum = input[a] + input[b];				// 1 unit
			if (sum == k) {								// 1 unit
				found = true;							// 1 unit
				break;
			}
			else if (sum < k) {							// 1 unit
				a++;									// 1 unit
			}
			else if (sum > k) {							// 1 unit
				b--;									// 1 unit
			}
		}
		return found;									// 1 unit
	}
	
}
