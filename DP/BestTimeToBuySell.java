/******************
Atmost one transaction 
******************/

class Solution {
    public int maxProfit(int[] prices) {   // 7,1,5,3,6,4]
    int min=Integer.MAX_VALUE,max=0;
     for(int i=0;i<prices.length;i++)  // i=0 to <6
     {
         min=Math.min(min,prices[i]);  // [7,1,5,3,6,4] 7 1 1  1 1
         max=Math.max(max,prices[i]-min);  // 0 0 4 4 5 5
     }
        return max;
        
    }
}
