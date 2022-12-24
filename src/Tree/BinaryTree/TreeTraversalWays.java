package Tree.BinaryTree;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class TreeTraversalWays {

    // LEFT ROOT RIGHT
    public static void inOrder(BinaryTreeNode<Integer> node ){
       if(node==null)
           return;

        inOrder(node.left);
       System.out.print(node.data+" ");
        inOrder(node.right);
    }

    // ROOT LEFT RIGHT
    public static void preOrder(BinaryTreeNode<Integer> node ){
       if(node==null)
           return;

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);

    }

    //LEFT RIGHT ROOT
    public static void postOrder(BinaryTreeNode<Integer> node ){
        if(node==null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");

    }

    public static void main(String[] args) {
        // 10 20 30 40 50 60 70 -1 -1 -1 -1 -1 -1 -1 -1
//        inOrder(takeInputLevelWise());
//        preOrder(takeInputLevelWise());
        postOrder(takeInputLevelWise());
    }
}
