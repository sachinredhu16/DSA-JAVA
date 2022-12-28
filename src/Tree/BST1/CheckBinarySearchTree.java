package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class CheckBinarySearchTree {

    public static boolean isBST(BinaryTreeNode<Integer> node){
        if(node==null)
            return true;

        int nodeData = node.data;
        int leftMax = maximum(node.left);
        int rightMin = minimum(node.right);
        if(nodeData<leftMax || nodeData>rightMin)
            return false;

        boolean bLeft = isBST(node.left);
        boolean bRight = isBST(node.right);
        if (bLeft&&bRight)
            return true;
        else
            return false;
    }

    public static int maximum(BinaryTreeNode<Integer> node){
        if(node==null)
            return Integer.MIN_VALUE;

        int max = node.data;
        int left = maximum(node.left);
        int right = maximum(node.right);
        if(left>max && left>right)
            max=left;
        if (right>max && right>left)
            max = right;
        return max;
    }
    public static int minimum(BinaryTreeNode<Integer> node){
        if(node==null)
            return Integer.MAX_VALUE;

        int min = node.data;
        int left = minimum(node.left);
        int right = minimum(node.right);
        if(left<min && left<right)
            min=left;
        if (right<min && right<left)
            min = right;
        return min;
    }

    public static void main(String[] args) {
        // 40 30 50 10 35 45 60 -1 -1 -1 -1 -1 -1 -1 -1
        BinaryTreeNode<Integer> node = takeInputLevelWise();
//        System.out.println("Maximum element is : "+maximum(node));
//        System.out.println("Minimum element is : "+minimum(node));
        if(isBST(node))
            System.out.println("Tree is BST");
        else
            System.out.println("Tree is not BST");

    }


}
