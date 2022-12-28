package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;



import java.net.Inet4Address;

import static Tree.BinaryTree.PrintBinaryTree.printTree;

public class InsertDeleteHas{
     static BinaryTreeNode<Integer> node;

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int n){
        if(node==null) {
            BinaryTreeNode<Integer> t = new BinaryTreeNode<>(n);
            return t;
        }
        if(node.data>n){
            node.left  = insertHelper(node.left,n);
        }
        else {
            node.right = insertHelper(node.right,n);
                    }
        return node;

    }
    public static void insert(int n){
        node = insertHelper(node,n);
    }

    public static void delete(int n){

    }
    private boolean hasDataHelper(BinaryTreeNode<Integer> node,int n){
        if(node==null)
            return false;

        if(node.data==n)
            return true;
        else if (node.data>n) {
            return hasDataHelper(node.left,n);
        }
        else
            return hasDataHelper(node.right,n);

    }
    public boolean hasData(int n){
        return hasDataHelper(this.node,n);
    }

    public static void main(String[] args) {
        insert(15);
        insert(10);
        insert(20);
        insert(17);
        insert(1);

        printTree(node);
    }

}
