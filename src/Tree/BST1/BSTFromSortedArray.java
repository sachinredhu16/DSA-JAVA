package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;

import static Tree.BinaryTree.PrintBinaryTree.printTree;

public class BSTFromSortedArray {

    public static BinaryTreeNode<Integer> bstFromSortedArray(int[] arr , int start, int end){
        if(start>end)
            return null;

        int mid = (start+end)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

        BinaryTreeNode<Integer> leftNode = bstFromSortedArray(arr,start,mid-1);
        BinaryTreeNode<Integer> rightNode = bstFromSortedArray(arr,mid+1,end);
        root.left = leftNode;
        root.right = rightNode;

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printTree(bstFromSortedArray(arr,0,arr.length-1));
    }
}
