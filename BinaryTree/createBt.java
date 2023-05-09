package BinaryTree;

class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data = data;
        left = right =null;

    }
}

class Binarytree{

    Node root;

    public void insertNode(int data){
        Node newNode = new Node(data);

        

        if(root ==null){
            root = newNode;
        }
        else{
            Node focusNode = root; 
            Node parent;

            while(true){
                parent = focusNode;
                if(data<focusNode.data){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.right;
                    if(focusNode ==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void preorderTraversal(Node focusNode){
        if(focusNode!=null){
            System.out.print(focusNode.data + " ");
            preorderTraversal(focusNode.left);
            preorderTraversal(focusNode.right);
        }
    }
}

public class createBt {
    public static void main(String[] args){
        Binarytree tree = new Binarytree();

        tree.insertNode(50);
        tree.insertNode(25);
        tree.insertNode(75);
        tree.insertNode(12);
        tree.insertNode(37);
        tree.insertNode(43);
        tree.insertNode(30);

        tree.preorderTraversal(tree.root);
    }  
    
}