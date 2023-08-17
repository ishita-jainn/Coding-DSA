package BinaryTree.Easy;

public class BalancedTree {
    private boolean flag;
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }

        int right = depth(root.right);
        int left = depth(root.left);

        if(Math.abs(right-left)>1){
            flag = false;
        }

        return Math.max(right,left)+1;

    }
    public boolean isBalanced(TreeNode root) {
        flag =true;

        depth(root);
        return flag;

    }
    
}
