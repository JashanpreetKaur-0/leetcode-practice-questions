class Solution {
    public String decodeString(String s) {
        Stack<Integer> numbers=new Stack<>();
        Stack<StringBuilder> words=new Stack<>();
        StringBuilder current=new StringBuilder();
        int number=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');

            }else if(ch=='['){
                numbers.push(number);
                words.push(current);

                number=0;
                current=new StringBuilder();

            }else if(ch==']'){
                int count=numbers.pop();
                StringBuilder prev=words.pop();

                for(int j=0;j<count;j++){
                    prev.append(current);
                }
                current=prev;
            }else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}