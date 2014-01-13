public class Problem6 {
	
	public static boolean problem6(int[] input, int k) {
		int size = input.length - 3;			// 2 unit
		for (int i = 0; i < size; i++) {		// 1 + (n + 1) + 1 unit
			int a = input[i];					// 1 unit
			int head = i + 1;					// 2 unit
			int tail = input.length - 1;		// 2 unit
			while (head < tail) {				// n unit
				int b = input[head];			// 1 unit
				int c = input[tail];			// 1 unit
				if (a + b + c == k) {			// 4 unit
					return true;				// 1 unit
				}
				else if (a + b + c > k) {		// 4 unit
					tail--;						// 1 unit
				}
				else {
					head++;						// 1 unit
				}
			}
		}
		return false;							// 1 unit
	}
}
