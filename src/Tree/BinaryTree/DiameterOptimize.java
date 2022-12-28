package Tree.BinaryTree;

public class DiameterOptimize {

    public static Pair<Integer,Integer> diameter(BinaryTreeNode<Integer> node ){
        if(node ==null){
            Pair<Integer,Integer> pair = new Pair<>();
            pair.first =0;
            pair.second=0;
            return pair;
        }
        Pair<Integer,Integer> leftOutput = diameter(node.left);
        Pair<Integer,Integer> rightOutput = diameter(node.right);
        int first = 1 + Math.max(leftOutput.first,rightOutput.first);
        int option1 = leftOutput.first + rightOutput.first;
        int option2 = leftOutput.second;
        int option3 = rightOutput.second;
        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> pair = new Pair<>();
        pair.first =first;
        pair.second=diameter;
        return pair;
    }
}
