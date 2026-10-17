import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        // Step 1: Calculate digit sum
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int num = nums[i];

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[i][0] = sum;
            arr[i][1] = nums[i];
        }

        // Step 2: Sort by digit sum, then by number
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        // Step 3: Store each number's correct index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i][1], i);
        }

        // Step 4: Count minimum swaps using cycles
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || map.get(nums[i]) == i) {
                continue;
            }

            int j = i;
            int count = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = map.get(nums[j]);
                count++;
            }

            swaps += count - 1;
        }

        return swaps;
    }
}