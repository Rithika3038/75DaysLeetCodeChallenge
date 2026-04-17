
class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        
        if (same(root, subRoot))
            return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean same(TreeNode root, TreeNode sub) {
        if(root == null && sub == null)
            return true;
        if(root == null || sub == null)
            return false;

        if(root.val != sub.val)
            return false;

        return same(root.left, sub.left) && same(root.right, sub.right);
    }
}