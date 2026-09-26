class Solution {
    public int vowelConsonantScore(String s) {
        String str=s.toLowerCase();
        int v=0;
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }else if(ch>='a' && ch<='z'){
                c++;
            }
        }
        int score;
        if(c>0){
            score=v/c;
        }else{
            score=0;
        }
        return score;
        
    }
}