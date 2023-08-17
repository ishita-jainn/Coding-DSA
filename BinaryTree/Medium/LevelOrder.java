package BinaryTree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null){
            return ans;
        }

        q.add(root);
        while(!q.isEmpty()){
            int l = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i=0;i<l;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                temp.add(q.remove().val);
            }
            ans.add(temp);
        }
        return ans;
    }
    
}
