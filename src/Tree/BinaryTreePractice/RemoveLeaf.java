package Tree.BinaryTreePractice;

import Tree.BinaryTree.BinaryTreeNode;

import static Tree.BinaryTree.PrintBinaryTree.printTree;
import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class RemoveLeaf {

    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> node){
        if(node == null)
            return null;
        if(node.left==null && node.right==null) {
            return null;
        }
        if(removeLeaf(node.left)==null){
            node.left=null;
        }if(removeLeaf(node.right)==null){
            node.right=null;
        }
        return node;

    }

    public static void main(String[] args) {
        // 10 20 30 40 50 60 70 -1 -1 -1 -1 -1 -1 -1 -1
        BinaryTreeNode<Integer> node = takeInputLevelWise();
        node = removeLeaf(node);
        printTree(node);
    }
}
