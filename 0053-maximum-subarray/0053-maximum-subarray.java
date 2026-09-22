class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentsum=nums[0];
        int maxsum=nums[0];

        for(int i=1;i<n;i++){
            if(currentsum<0){
                currentsum=nums[i];
            }else{
                currentsum+=nums[i];
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        return maxsum;
        
    }
}