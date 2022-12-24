package Tree.BinaryTree;

public class PrintBinaryTree {
    public static void printTree(BinaryTreeNode<Integer> node ){
        if(node ==null)
            return;
        String s= node.data+" : ";
        s += node.left!=null?"L "+node.left.data+" ":" ";
        s += node.right!=null?"R "+node.right.data+" ":" ";
        System.out.println(s);

        printTree(node.left);
        printTree(node.right);
    }
}
