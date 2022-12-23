package Tree.BasicTree;

public class NumberOfNodes {

    public static int countNodes(TreeNode<Integer> node){
        if(node==null)
            return 0;
        int count =1;
        for(int i=0;i<node.children.size();i++){
            count+= countNodes(node.children.get(i));
        }

        return count;
    }
    public static void main(String[] args) {

        int numberOfNodes = countNodes(TreeInputLevelWise.takeInput());
        System.out.println("Number of Nodes are : "+numberOfNodes);

    }
}
