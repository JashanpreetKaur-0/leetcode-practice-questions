class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }
            else if(operations[i].equals("D")){
                int last=list.get(list.size()-1);
                list.add(last*2);
            }
            else if(operations[i].equals("+")){
                int last=list.get(list.size()-1);
                int second=list.get(list.size()-2);
                list.add(last+second);
            }else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}