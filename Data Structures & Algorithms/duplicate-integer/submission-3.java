class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        for(int a = 0; a < nums.length - 1; a++){
            if(nums[i] == nums[j]){
                return true;
            }else {
                i++;
                j++;
            }
        }
        return false;
    }
}