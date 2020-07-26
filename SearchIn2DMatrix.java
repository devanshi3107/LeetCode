/****************
Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Example 1:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
output- true
************************************/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
       int m=matrix.length;
        if(m==0)
            return false;
        int n=matrix[0].length;
        if(n==0)
            return false;
        int l=0,h=m*n-1;
        int mid,mid_element;
        while(l<=h)
        {
            mid=l+(h-l)/2;
            mid_element=matrix[mid/n][mid%n];  // this gives the element in matrix 
            if(mid_element == target)
              return true;
            else if(mid_element<target)
                l=mid+1;
            else
                h=mid-1;
        }
        return false;
    }
}
