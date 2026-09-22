class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int total=0;
        int minlength=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            total+=nums[right];

            while(total>=target){
                int windowlength=right-left+1;
                if(windowlength<minlength){
                    minlength=windowlength;
                }
                total-=nums[left];
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}