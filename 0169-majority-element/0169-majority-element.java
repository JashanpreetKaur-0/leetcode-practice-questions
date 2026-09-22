class Solution {
    public int majorityElement(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;

        
        int ca=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                ca=num;
            }

            if(ca==num){
                count++;
            }else{
                count--;
            }
        }
        return ca;
    }
}

    