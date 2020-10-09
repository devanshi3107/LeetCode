/****************************
Find triplet pairs in array that add upto a specific sum, here sum=0
We are using same approach like 2 sum

****************************/

class Solution {
    public List<List<Integer>> threeSum(int[] A) {
       // Fix the first element as A[i] 
        int arr_size=A.length;
        List<List<Integer>> mlist = new ArrayList<>();
        List<Integer> ans;
        int sum=0;
        for (int i = 0; i < arr_size - 2; i++) { 
  
            // Find pair in subarray A[i+1..n-1] 
            // with sum equal to sum - A[i] 
            HashSet<Integer> s = new HashSet<Integer>(); 
            int curr_sum = sum - A[i]; 
            for (int j = i + 1; j < arr_size; j++) {
                ans = new ArrayList<>();
                if (s.contains(curr_sum - A[j])) { 
                    // System.out.printf("Triplet is %d, %d, %d", A[i], 
                    //                   A[j], curr_sum - A[j]); 
                    ans.add(A[i]);
                    ans.add(A[j]);
                    ans.add(curr_sum-A[j]);
                    Collections.sort(ans);
                    if(!mlist.contains(ans))
                        mlist.add(ans);
                } 
                s.add(A[j]); 
            } 
        } 
  
        // If we reach here, then no triplet was found 
        return mlist;     
    }
}
