public class Problem5 {

    public static void main(final String[] args) {
        System.out.println(problem5(new int[] { -5, -1, 0, 1, 3, 6, 9, 10, 12, 13, 18, 27, 30 }, 24));
    }

    private static boolean problem5(final int[] input, final int k) {
        boolean found = false;
        int a = 0;
        int b = input.length - 1;
        for (int i = 0; i < input.length; i++) {
            int sum = input[a] + input[b];
            if (sum == k) {
                found = true;
                break;
            }
            else if (sum < k) {
                a++;
            }
            else if (sum > k) {
                b--;
            }
        }
        return found;
    }

}
