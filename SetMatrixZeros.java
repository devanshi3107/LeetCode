/********************************
Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]

********************************/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n=matrix[0].length;
       int rows[] = new int[m];
        Arrays.fill(rows,1);
        int col[] = new int[n];
        Arrays.fill(col,1);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == 0)
                {rows[i]=0;col[j]=0;}
                    
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rows[i] == 0 || col[j] == 0)
                    matrix[i][j]=0;
            }
        }
    }
}
