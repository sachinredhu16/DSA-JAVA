package Tree.BasicTree;

public class depthOfNode {
    // printing all nodes at a particular depth

    public static void printAllDepth(TreeNode<Integer> node,int depth){
        if(depth==-1)
            return;
        if(depth==0){
            System.out.println(node.data);
            return;
        }
        for(int i=0;i<node.children.size();i++){
            printAllDepth(node.children.get(i),depth-1);
        }
    }
    public static void main(String[] args) {
        printAllDepth(TreeInputLevelWise.takeInput(),2);
    }

}
