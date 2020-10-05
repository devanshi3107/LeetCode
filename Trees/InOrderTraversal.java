class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> mlist = new ArrayList<>();
        List<Integer> left1 = new ArrayList<>();
        List<Integer> right1 = new ArrayList<>();
        left1=inorderTraversal(root.left);
        right1=inorderTraversal(root.right);
        mlist.addAll(left1);
        mlist.add(root.val);
        mlist.addAll(right1);
        
        return mlist;
    }
}
