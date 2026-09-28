class Solution {
    public boolean checkIfPangram(String sentence) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char ch:sentence.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // return map.size()==26;

        HashSet<Character> map=new HashSet<>();
        for(char ch:sentence.toCharArray()){
            if(Character.isLetter(ch)){
                map.add(ch);
            }
            }
            return map.size()==26;
    }
}