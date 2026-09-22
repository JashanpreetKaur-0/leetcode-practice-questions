class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            int digit=0;
            while(number>0){
                digit++;
                number=number/10;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}