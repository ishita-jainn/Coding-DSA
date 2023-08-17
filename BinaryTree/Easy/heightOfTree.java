package BinaryTree.Easy;

public class heightOfTree {

    public static int ht(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = ht(root.left);
        int right = ht(root.right);

        int ans = Math.max(left,right) +1;
        return ans;
    }
    

    public static int diameter(TreeNode root){
        if(root==null){
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = ht(root.left) + ht(root.right) + 1;

        int ans = Math.max(Math.max(diam1,diam2) , diam3);

        return ans;        
    }

    static class TreeInfo{
        int diam;
        int htt;

        TreeInfo(int htt, int diam){
            this.htt = htt;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(TreeNode root){

        if(root==null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myht = Math.max(left.htt,right.htt) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.htt + right.htt +1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo obj = new TreeInfo(myht,mydiam);

        return obj;

    }
    

}
