package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;


import static Tree.BinaryTree.PrintBinaryTree.printTree;

public class InsertDeleteHas{

    /* Time complexity of all operations :-
        1. Insertion -->> O(height) -->> )(logn)
        2. Searching -->> O(height)
        3. Deletion -->> h(Search node for deletion)+h-k(search minNode of right side)+h-k(delete that)
                        -->> O(height)
    *
    */
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


    private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> node , int n){
        if(node==null) {
            BinaryTreeNode<Integer> t = new BinaryTreeNode<>(n);
            return t;
        }
        if(node.data>n){
            node.left  = deleteHelper(node.left,n);
        }
        else if(node.data<n){
            node.right = deleteHelper(node.right,n);
        }
        else {
            if(node.left==null && node.right==null)
                return null;
            else if(node.left==null)
                node= node.right;
            else if (node.right==null)
                node = node.left;
            else{
                BinaryTreeNode<Integer> minNode = node.right;
                while (minNode.left!=null)
                    minNode = minNode.left;
                node.data =  minNode.data;
                node.right = deleteHelper(node.right,minNode.data);
            }
        }

        return node;
    }
    public static void delete(int n){
        node = deleteHelper(node,n);
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
        insert(20);
        insert(10);
        insert(30);
        insert(5);
        insert(15);
        insert(25);
        insert(40);


        printTree(node);
        delete(20);
        System.out.println("After deletion ");
        printTree(node);
    }

}
