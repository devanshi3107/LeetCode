/***********
O(1) time complexity
**************/


class Solution {
    public boolean isPowerOfFour(int num) {
        double val=Math.log(num)/Math.log(4);
        if(val%1==0)
            return true;
        else return false;
    }
}


