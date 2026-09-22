class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<=n;i++){
            a^=i;
        }
        for(int num:nums){
            a^=num;
        }
        return a;
    }
    
}