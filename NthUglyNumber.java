class Solution {
    public int nthUglyNumber(int n) {
        int num=1;
        int count=0;
        int f,ans=1;
        n=1352;
        while(count!=n)
        {
         f= isUgly(num);
            if(f==1)
            { count++;ans=num;}
            num++;
        }
        return ans;
        
    }
    int isUgly(int num)
    {
        if(num==1)
            return 1;
        if(num%2==0)
        {
            num=num/2;
            return isUgly(num);
        }
        if(num%3==0)
        {
            num=num/3;
            return isUgly(num);
        }
        if(num%5==0)
        {
            num=num/5;
            return isUgly(num);
        }
        return 0;
    }
}
