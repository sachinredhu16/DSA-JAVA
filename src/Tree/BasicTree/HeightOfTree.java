package Tree.BasicTree;

public class HeightOfTree {
    // consider a node as height = 1

    public static int heightOfTree(TreeNode<Integer> node){
        if(node ==null){
            return Integer.MIN_VALUE;
        }
        int height =0;

        for(int i=0;i<node.children.size();i++){
            int num = heightOfTree(node.children.get(i));
            if(num>height)
                height=num;
        }
        return height+1;
    }
    public static void main(String[] args) {
        int height = heightOfTree(TreeInputLevelWise.takeInput());
        System.out.println("Height is : "+height);
    }
}
