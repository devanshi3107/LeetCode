class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0,count=0;
        int m=nums1.length;
        int n=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=(nums1.length<nums2.length)?nums1.length:nums2.length;
        int ans[] = new int[l];
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])  // 1 2 3   // 2 4 
                i++;
            else if(nums2[j]<nums1[i])
                j++;
            else 
            {ans[k++]=nums1[i++];
                j++;count++;
            }
        }
        int res[]=new int[count];
        for(i=0;i<count;i++)
        {
            res[i]=ans[i];
        }
        return res;    
        
    }
}
