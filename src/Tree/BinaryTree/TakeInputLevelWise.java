package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static Tree.BinaryTree.PrintBinaryTree.printTree;

public class TakeInputLevelWise {

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root ");
        int n = sc.nextInt();
        if(n==-1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryTreeNode<Integer> temp = queue.remove();
            System.out.println("Enter the Left node of "+temp.data);
            int n1 = sc.nextInt();
            if(n1!=-1) {
                BinaryTreeNode<Integer> left = new BinaryTreeNode<>(n1);
                temp.left = left;
                queue.add(left);
            }
            System.out.println("Enter the Right node of "+temp.data);
            n1 = sc.nextInt();
            if(n1!=-1) {
                BinaryTreeNode<Integer> right = new BinaryTreeNode<>(n1);
                temp.right = right;
                queue.add(right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        printTree(takeInputLevelWise());
    }
}
