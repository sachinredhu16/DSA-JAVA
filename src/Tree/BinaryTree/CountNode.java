package Tree.BinaryTree;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class CountNode {

    public static int countNodes(BinaryTreeNode<Integer> node){
        if(node ==null)
            return 0;
        int count =0;
        if(node.left!=null)
            count += countNodes(node.left);
        if(node.right!=null)
            count+= countNodes(node.right);

        return count+1;
    }

    public static void main(String[] args) {
        System.out.println("Number of Nodes is : "+ countNodes(takeInputLevelWise()));
    }
}
