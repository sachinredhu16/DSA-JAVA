package Tree;

import static Tree.TreeInputLevelWise.takeInput;

public class CountLeafNodes {

    public static int countLeafNodes(TreeNode<Integer> node ){
        if(node==null)
            return 0;
        int count =0;
        if(node.children.size()==0)
            return 1;
        for(int i=0;i<node.children.size();i++){
            count += countLeafNodes(node.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) {
        int count = countLeafNodes(takeInput());
        System.out.println("Count of leaf node is : "+count);
    }

}
