package BinaryTree.Easy;

public class diameter {
    class Tree{
        int ht;
        int diam;

        Tree(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public Tree diameter1(TreeNode root) {
        if(root == null){
            return new Tree(0,0);
        }

        Tree right = diameter1(root.right);
        Tree left = diameter1(root.left);

        int myht = Math.max(right.ht , left.ht) +1;

        int diam1 = right.diam;
        int diam2 = left.diam;
        int diam3 = right.ht + left.ht +1;

        int ans = Math.max(Math.max(diam1,diam2),diam3) ;

        return new Tree(myht,ans);
        
    }

    public int diameterOfBinaryTree(TreeNode root) {

        return diameter1(root).diam -1;

    }
    
}
