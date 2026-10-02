class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            boolean replaced=false;

            for(int j=0;j<indices.length;j++){
                if(i==indices[j] && s.startsWith(sources[j],i)){
                    result.append(targets[j]);
                    i=i+sources[j].length()-1;
                    replaced=true;
                }
            }
            if (!replaced) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}