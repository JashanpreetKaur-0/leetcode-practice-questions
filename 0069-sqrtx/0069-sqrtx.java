class Solution {
    public int mySqrt(int x) {
      int s=1;
      int e=x/2;
    if(x==0 || x==1) return x;
      int ans=0;

      for(int i=0;i<e;i++){
        int mid=s+(e-s)/2;
        if(mid<=x/mid){
            ans=mid;
            s=mid+1;
        }else{
            e=mid-1;
        }
      }
      return ans;
    }
}