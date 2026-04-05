class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> luna = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            luna.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int d = target - nums[i];
            if(luna.containsKey(d) && luna.get(d) != i){
                return new int []{i, luna.get(d)};
            }
        }
        return new int [0];
    }
}
