class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] left=new int[nums.length];
        // int[] right=new int[nums.length];
        // left[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }
        // right[nums.length-1]=1;
        // for(int i=nums.length-2;i>-1;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }
        // int[] ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=left[i]*right[i];
        // }
        // return ans;

        int[] ans=new int[nums.length];
        int left=1;
        int right=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=left;
            left*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}