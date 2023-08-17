package BinaryTree.Easy;

public class countNodes {

    public static int count(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);

        return left+right+1;

    }
    
}
