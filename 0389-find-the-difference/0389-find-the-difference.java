class Solution {
    public char findTheDifference(String s, String t) {
        // char result=0;
        // for(char c:s.toCharArray()){
        //     result^=c;
        // }
        // for(char c:t.toCharArray()){
        //     result^=c;
        // }
        // return result;

        int sum=0;
        for(int i=0;i<t.length();i++){
            sum+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            sum-=s.charAt(i);
        }
        return (char) sum;
        
    }
}