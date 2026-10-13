class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int mincap=Integer.MAX_VALUE;
        int minindex=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<mincap){
                    mincap=capacity[i];
                    minindex=i;
                }
            }
        }
        return minindex;
    }
}