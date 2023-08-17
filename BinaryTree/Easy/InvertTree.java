package BinaryTree.Easy;

public class InvertTree {
    public void solve(TreeNode root){
        if(root == null){
            return;
        }

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        solve(root.left);
        solve(root.right);

    }
    public TreeNode invertTree(TreeNode root) {
        solve(root);

        return root;

        
    }
    
}
