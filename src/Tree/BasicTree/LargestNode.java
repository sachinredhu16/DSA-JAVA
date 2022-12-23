package Tree.BasicTree;

public class LargestNode {

    public static int largestNode(TreeNode<Integer> node){
        if(node ==null){
            return Integer.MIN_VALUE;
        }
        int large = node.data;
        for(int i=0;i<node.children.size();i++){
            int max = largestNode(node.children.get(i));
            if(large<max)
                large = max;
        }
        return large;

    }
    public static void main(String[] args) {

        int large = largestNode(TreeInputLevelWise.takeInput());
        System.out.println("Large node data is : "+large);
    }
}
