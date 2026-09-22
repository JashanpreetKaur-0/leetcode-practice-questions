class Solution {
    public int compress(char[] chars) {
        StringBuilder ans=new StringBuilder("");
        int i=0,j=0;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                j++;
            }else{
                ans.append(chars[i]);
                if((j-i)>1){
                    ans.append(j-i);
                }
                i=j;
            }
        }
        ans.append(chars[i]);
                if((j-i)>1){
                    ans.append(j-i);
                }
        for(i=0;i<ans.length();i++){
            chars[i]=ans.charAt(i);
        }
        return ans.length();


        
    }
}