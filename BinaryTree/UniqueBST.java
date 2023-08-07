package BinaryTree;

import java.util.ArrayList;
import java.util.List;




// Definition for a binary tree node.
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

public class UniqueBST{

    public List<TreeNode> helper(int st, int end) {
        if(st>end){
            List<TreeNode> base = new ArrayList<>();
            base.add(null);
            return base;
        }
        List<TreeNode> ans = new ArrayList<>();
        for(int i=st;i<=end;i++){
            List<TreeNode> left = helper(st,i-1);
            List<TreeNode> right = helper(i+1,end);
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    ans.add(root);

                }
            }
        }
        return ans;
        
        
    }
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);

        
    }
}
    

