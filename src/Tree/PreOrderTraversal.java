package Tree;

import static Tree.TreeInputLevelWise.takeInput;

public class PreOrderTraversal {

    public static void preOrder(TreeNode<Integer> node){
        if(node ==null)
            return;
        System.out.print(node.data+" ");
        for(int i=0;i<node.children.size();i++){
            preOrder(node.children.get(i));
        }

    }

    public static void main(String[] args) {
        preOrder(takeInput());
    }
}
