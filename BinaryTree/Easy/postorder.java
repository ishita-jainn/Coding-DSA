package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;

public class postorder {
    private List<Integer> list = new ArrayList<>();
    public void traverse(TreeNode root){
        
        if(root == null){
            return;
                        
        }
        
        traverse(root.left);        
        traverse(root.right);
        list.add(root.val);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return list;
        
    }
    
}
