/*********************************
Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
******So, we can first create a transpose and then reverse values collumn wise ************

************************************/

class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int temp;
        //int M2[][] = new int[m][n];
        int r,c;
        for(r=0;r<m;r++)
        {
            for(c=0;c<r;c++)
            {
                temp=matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;
            }
        }   // we got transpose
       // now reverse collumns
        r=0;
        for(r=0;r<m;r++)
        {
            for(c=0;c<n/2;c++)
            {
                temp=matrix[r][c];
                matrix[r][c]=matrix[r][n-c-1];
                matrix[r][n-c-1]=temp;
            }
        }   
    }
}
