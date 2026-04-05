class Solution {
    public int maxProfit(int[] nums) {
        int i=0;
        int j=1;
        int mx=0;
        while(j<nums.length){
            if(nums[i]<nums[j]){
                mx=Math.max(mx,nums[j]-nums[i]);
                j++;
            }
            else{
                i=j;
                j++;
            }

        }
        return mx;
    }
}
