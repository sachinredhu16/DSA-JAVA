package Tree.BinaryTree;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class CountNode {

    public static int countNodes(BinaryTreeNode<Integer> node) {
        if (node == null)
            return 0;
        int count = 0;
        count += countNodes(node.left);
        count += countNodes(node.right);
        return count + 1;
    }

    public static void main(String[] args) {
        // 10 20 30 40 50 60 70 -1 -1 -1 -1 -1 -1 -1 -1
        System.out.println("Number of Nodes is : " + countNodes(takeInputLevelWise()));
    }
}
