package BinaryTree.Medium;

import java.util.*;

public class RightView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null){
            return list;
        }
        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();
                if(i==s-1){
                    list.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                
            }
        }
        
        return list;
        
    }
    
}
