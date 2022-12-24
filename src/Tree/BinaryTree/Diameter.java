package Tree.BinaryTree;

import javax.swing.*;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class Diameter {

    // this solution has time complexity O(n*h) ------ h = height
    public static int calculatingDia(BinaryTreeNode<Integer> node ){
        if(node==null)
            return 0;
        int option1 = height(node.left)+height(node.right);
        int option2 = calculatingDia(node.left);
        int option3 = calculatingDia(node.right);
        return Math.max(option1,Math.max(option2,option3));
    }

    public static int height(BinaryTreeNode<Integer> node ){
        if(node==null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1+Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args) {
        System.out.println("Diameter is : "+calculatingDia(takeInputLevelWise()));
    }

}
