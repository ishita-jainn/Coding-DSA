package BinaryTree.Medium;

public class ValidateBST {
    public boolean bst(TreeNode root, TreeNode min, TreeNode max){
        if(root==null){
            return true;
        }        

        if(min!=null && root.val<=min.val){
            return false;
        }
        if(max!=null && root.val>=max.val){
            return false; 
        }

        return bst(root.left,min,root) && bst(root.right, root, max);
    }

    public boolean isValidBST(TreeNode root) {
        return bst(root,null,null);
        
    }
    
}
