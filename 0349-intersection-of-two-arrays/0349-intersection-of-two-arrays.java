class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        HashSet<Integer> newset=new HashSet<>();
        for(int x:nums2){
            if(set.contains(x)){
                newset.add(x);
            }
        }
        int[] arr=new int[newset.size()];
        int y=0;
        for(int w:newset){
            arr[y]=w;
            y++;
        }
        return arr;
    }
}