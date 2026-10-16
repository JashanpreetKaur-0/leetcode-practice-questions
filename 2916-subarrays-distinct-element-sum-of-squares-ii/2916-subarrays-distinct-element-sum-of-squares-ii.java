import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    class SegmentTree {
        long[] sum;
        long[] square;
        long[] lazy;
        int n;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            square = new long[4 * n];
            lazy = new long[4 * n];
        }

        void update(int node, int start, int end,
                    int left, int right) {
            if (left > end || right < start) {
                return;
            }

            if (left <= start && end <= right) {
                long len = end - start + 1;

                square[node] =
                    (square[node] + 2 * sum[node] + len) % MOD;

                sum[node] = (sum[node] + len) % MOD;
                lazy[node]++;
                return;
            }

            push(node, start, end);

            int mid = (start + end) / 2;

            update(node * 2, start, mid, left, right);
            update(node * 2 + 1, mid + 1, end, left, right);

            sum[node] =
                (sum[node * 2] + sum[node * 2 + 1]) % MOD;

            square[node] =
                (square[node * 2] + square[node * 2 + 1]) % MOD;
        }

        void push(int node, int start, int end) {
            if (lazy[node] == 0 || start == end) {
                return;
            }

            int mid = (start + end) / 2;
            apply(node * 2, start, mid, lazy[node]);
            apply(node * 2 + 1, mid + 1, end, lazy[node]);

            lazy[node] = 0;
        }

        void apply(int node, int start, int end, long value) {
            long len = end - start + 1;

            square[node] = (square[node]
                + 2 * value % MOD * sum[node] % MOD
                + value * value % MOD * len % MOD) % MOD;

            sum[node] = (sum[node] + value * len) % MOD;
            lazy[node] += value;
            lazy[node] %= MOD;
        }

        long query() {
            return square[1];
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        SegmentTree tree = new SegmentTree(n);
        Map<Integer, Integer> last = new HashMap<>();

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int previous = last.getOrDefault(nums[i], -1);

            tree.update(1, 0, n - 1, previous + 1, i);

            last.put(nums[i], i);

            ans = (ans + tree.query()) % MOD;
        }

        return (int) ans;
    }
}