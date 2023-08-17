package BinaryTree.Medium;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LCAofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val,q.val);
        int large = Math.max(p.val,q.val);

        while(root!=null){
            if(root.val>large){
                root = root.left;
            }
            else if(root.val<small){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
    
}
