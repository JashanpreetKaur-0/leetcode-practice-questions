
import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {

        int n = rains.length;

        int[] ans = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            if (rains[i] == 0) {

                set.add(i);
                ans[i] = 1;

            } else {

                int lake = rains[i];

                if (map.containsKey(lake)) {

                    int lastDay = map.get(lake);

                    Integer dryDay = set.higher(lastDay);

                    if (dryDay == null) {
                        return new int[0];
                    }

                    ans[dryDay] = lake;

                    set.remove(dryDay);
                }

                map.put(lake, i);

                ans[i] = -1;
            }
        }

        return ans;
    }
}

