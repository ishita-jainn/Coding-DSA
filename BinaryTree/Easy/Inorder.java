package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Inorder {
    private List<Integer> list = new ArrayList<>();
    public void traverse(TreeNode root){
        
        if(root == null){
            return;
                        
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return list;
        
        
    }
    
}
