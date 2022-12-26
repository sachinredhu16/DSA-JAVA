package Tree.Practice;

import Tree.BinaryTree.BinaryTreeNode;

import static Tree.BinaryTree.PrintBinaryTree.printTree;
import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class MirrorBinary {

    public static void mirrorBinary(BinaryTreeNode<Integer> node){
        if(node ==null)
            return;
        mirrorBinary(node.left);
        mirrorBinary(node.right);

        BinaryTreeNode<Integer> temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public static void main(String[] args) {
        // 10 20 30 40 50 60 70 -1 -1 -1 -1 -1 -1 -1 -1
        BinaryTreeNode<Integer> node = takeInputLevelWise();
        System.out.println("===============================================");
        printTree(node);
        mirrorBinary(node);
        System.out.println("===============================================");
        printTree(node);

    }
}
