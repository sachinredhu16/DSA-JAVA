package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class CheckNumberIsPresentInBST {

    public static BinaryTreeNode<Integer> check(BinaryTreeNode<Integer> node , int n ){
        if(node==null)
            return null;
        if(node.data==n)
            return node;
        BinaryTreeNode<Integer> result;
        if(node.data<n)
            result = check(node.right,n);
        else
            result = check(node.left,n);

        return result;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> node = takeInputLevelWise();
        System.out.println("Data is : "+(null!=check(node,20)?check(node,20).data:"Not Found"));
    }
}
