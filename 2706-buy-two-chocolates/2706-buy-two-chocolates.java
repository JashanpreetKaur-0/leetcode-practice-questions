class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        for(int n:prices){
            if(n<min){
                min1=min;
                min=n;

            }else if(n<min1){
                min1=n;
            }
        }
        int cost=min+min1;
        if(cost<=money){
            return money-cost;
        }
        return money;
    }
}