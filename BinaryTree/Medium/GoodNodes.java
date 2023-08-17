package BinaryTree.Medium;

public class GoodNodes {
    int count =0;
    int traverse(TreeNode root, int num){
        if(root==null){
            return 0;
        }

        if(root.val>=num){
            count++;
        }
        int max = Math.max(root.val,num);
        traverse(root.right,max);
        traverse(root.left, max);
        return count;

    }
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }    
        return traverse(root,root.val);    
    }
    
}
