
class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder ans = new StringBuilder();

        String a = "";

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            char ch = Character.toLowerCase(word.charAt(0));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                word = word + "ma";
            }
            else {
                word = word.substring(1) + word.charAt(0) + "ma";
            }

            a = a + "a";

            word = word + a;

            if(i > 0) {
                ans.append(" ");
            }

            ans.append(word);
        }

        return ans.toString();
    }
}
