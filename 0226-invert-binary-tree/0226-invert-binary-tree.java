class Solution{
    public TreeNode invertTree(TreeNode root){
        if(root == null)
        return null;
        Queue<TreeNode> q = new LinkedList<>();
         q.add(root);

        while (!q.isEmpty()) {
            TreeNode c = q.poll(); 
            TreeNode t = c.left;
            c.left = c.right;
            c.right = t;

            if (c.left != null)
                q.add(c.left);
            if (c.right != null)    
                q.add(c.right);
        }
        return root;
    }
}