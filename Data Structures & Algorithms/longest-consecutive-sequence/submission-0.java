public class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> luna = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if (!luna.containsKey(num)) {
                luna.put(num, luna.getOrDefault(num - 1, 0) + luna.getOrDefault(num + 1, 0) + 1);
                luna.put(num - luna.getOrDefault(num - 1, 0), luna.get(num));
                luna.put(num + luna.getOrDefault(num + 1, 0), luna.get(num));
                res = Math.max(res, luna.get(num));
            }
        }
        return res;
    }
}