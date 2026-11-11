
class Solution {
    public String[] findWords(String[] words) {

        ArrayList<String> list = new ArrayList<>();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (int i = 0; i < words.length; i++) {

            String word = words[i].toLowerCase();

            boolean r1 = true;
            boolean r2 = true;
            boolean r3 = true;

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (!row1.contains(ch + "")) {
                    r1 = false;
                }

                if (!row2.contains(ch + "")) {
                    r2 = false;
                }

                if (!row3.contains(ch + "")) {
                    r3 = false;
                }
            }

            if (r1 || r2 || r3) {
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}
