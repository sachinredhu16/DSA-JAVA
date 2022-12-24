package Tree.BinaryTree;

import java.util.Scanner;

import static Tree.BinaryTree.PrintBinaryTree.printTree;

public class FirstBinaryTree {

    static Scanner sc = new Scanner(System.in);
    public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter the value of node ");
        int n = sc.nextInt();
        if(n==-1)
            return null;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(n);


        node.left = takeInput();
        node.right = takeInput();
        return node;
    }


    public static void main(String[] args) {
        // 10 20 40 -1 -1 50 -1 -1 30 60 -1 -1 70 -1 -1
        printTree(takeInput());
    }
}
