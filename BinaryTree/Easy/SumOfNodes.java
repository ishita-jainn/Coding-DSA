package BinaryTree.Easy;

public class SumOfNodes {

    static int left=0, right =0;

    public static int sum(TreeNode root){
        if(root == null){
            return 0;
        }

        left += sum(root.left);
        right += sum(root.right);

        return left + right + root.val;
    }
    
}
