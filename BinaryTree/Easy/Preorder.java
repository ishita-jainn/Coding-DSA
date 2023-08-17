package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    private List<Integer> list = new ArrayList<>();
    public void traverse(TreeNode root){
        
        if(root == null){
            return;
                        
        }
        list.add(root.val);
        traverse(root.left);        
        traverse(root.right);

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return list;
        
    }
    
}
