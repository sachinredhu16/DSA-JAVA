package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class PrintBetweenRange {

    public static void printElements(BinaryTreeNode<Integer> node , int k1, int k2){
        if(node==null)
            return;
        if(node.data>k1)
            printElements(node.left,k1,k2);
        if (node.data>k1 && node.data<k2)
            System.out.print(node.data+" ");
        if(node.data<k2)
            printElements(node.right,k1,k2);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> node = takeInputLevelWise();
        printElements(node,20,60);
    }
}
