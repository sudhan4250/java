import java.util.HashMap;
import java.util.Scanner;
public class info {
        public static int findMaxLength(int[] nums) {
            // HashMap to store the first occurrence of a prefix sum
            HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
            int maxLength = 0;
            int prefixSum = 0;

            for (int i = 0; i < nums.length; i++) {
                // Convert 0 to -1
                if (nums[i] == 0) {
                    prefixSum -= 1;
                } else {
                    prefixSum += 1;
                }

                // Check if the prefixSum is zero, meaning the entire array up to i has equal 0's and 1's
                if (prefixSum == 0) {
                    maxLength = i + 1;
                }

                // If the prefixSum has been seen before
                if (prefixSumMap.containsKey(prefixSum)) {
                    maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum));
                } else {
                    // Store the first occurrence of the prefixSum
                    prefixSumMap.put(prefixSum, i);
                }
            }

            // If no valid subarray is found, return -1
            return maxLength > 0 ? maxLength : -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            int result = findMaxLength(A);
            System.out.println(result);
        }
    }

