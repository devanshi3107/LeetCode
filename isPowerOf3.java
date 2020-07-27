/**************
eg - 27=3^3---true
     45 --- false
     0---false
     1---true ---3^0=1
***********************************/     


class Solution {
    public boolean isPowerOfThree(int n) {   
        if(n==3 || n==1)
            return true;
        if(n%3!=0 || n==0)                
            return false;           
        
        return isPowerOfThree(n/3);    
        
    }
}
