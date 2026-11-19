class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            list.clear();
            for(int j=i;j<arr.length;j++){
                list.add(arr[j]);
                if(list.size()%2!=0){
                    for(int num:list){
                        sum+=num;
                    }
                }
            }
        }
        return sum;
    }
}