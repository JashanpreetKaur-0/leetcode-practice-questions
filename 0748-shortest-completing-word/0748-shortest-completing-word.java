class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<licensePlate.length();i++){
            char ch=Character.toLowerCase(licensePlate.charAt(i));
            if(ch>='a' && ch<='z'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        String ans="";
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            HashMap<Character,Integer> temp=new HashMap<>();

            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            boolean flag=true;
            for(char key:map.keySet()){
                if(temp.getOrDefault(key, 0) < map.get(key)) {
                    flag = false;
                    break;
                }
            }

            // Find shortest valid word
            if(flag && (ans.equals("") || word.length() < ans.length())) {
                ans = words[i];
            }
        }

        return ans;
           
    }
}