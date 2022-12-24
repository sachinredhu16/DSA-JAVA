package Tree.BinaryTree;

public class DiameterOptimize {

    public static Pair<Integer,Integer> diameter(BinaryTreeNode<Integer> node ){
        if(node ==null){
            Pair<Integer,Integer> pair = new Pair<>();
            pair.height =0;
            pair.diameter=0;
            return pair;
        }
        Pair<Integer,Integer> leftOutput = diameter(node.left);
        Pair<Integer,Integer> rightOutput = diameter(node.right);
        int height = 1 + Math.max(leftOutput.height,rightOutput.height);
        int option1 = leftOutput.height + rightOutput.height;
        int option2 = leftOutput.diameter;
        int option3 = rightOutput.diameter;
        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> pair = new Pair<>();
        pair.height =height;
        pair.diameter=diameter;
        return pair;
    }
}
