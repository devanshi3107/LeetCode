/****************
n=5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1


**************/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mlist = new ArrayList<>();
        // List<Integer> m = new ArrayList<>();
        // m.add(1);
        // mlist.add(m);
        int i,j;
        //System.out.print(mlist.get(0).get(0));
        for(i=0;i<numRows;i++)
        {
            List<Integer> ans=new ArrayList<>();
            for(j=0;j<=i;j++)
            {
                if(i==j || j==0)
                   ans.add(1);
                else
                    ans.add(mlist.get(i-1).get(j-1)+mlist.get(i-1).get(j));
            }
            mlist.add(ans);
            
        }
        return mlist;
    }
}
