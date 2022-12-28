package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;
import Tree.BinaryTree.Pair;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class CheckBinarySearchTreeOptimize {

    public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> node){
        if(node==null){
            Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
            output.first = true;
            output.second = new Pair<>();
            output.second.first= Integer.MAX_VALUE;
            output.second.second= Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBST2(node.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBST2(node.right);

        int min = Math.min(node.data,Math.min(leftOutput.second.first,rightOutput.second.first));
        int max = Math.max(node.data,Math.max(leftOutput.second.second,rightOutput.second.second));
        boolean isBst = (node.data>leftOutput.second.second)
                &&(node.data<=rightOutput.second.first)
                && leftOutput.first && rightOutput.first;

        Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
        output.first = isBst;
        output.second = new Pair<>();
        output.second.first= min;
        output.second.second= max;
        return output;
    }

    public static boolean isBST3(BinaryTreeNode<Integer> node, int start,int end){
        if(node==null)
            return true;

        if(node.data<start || node.data>end)
            return false;

        boolean isLeftBST = isBST3(node.left,start,node.data-1);
        boolean isRightBST = isBST3(node.right,node.data,end);
        return isLeftBST && isRightBST;

    }




    public static void main(String[] args) {
        // 40 30 50 10 35 45 60 -1 -1 -1 -1 -1 -1 -1 -1
        BinaryTreeNode<Integer> node = takeInputLevelWise();
//        System.out.println("Maximum element is : "+maximum(node));
//        System.out.println("Minimum element is : "+minimum(node));

        Pair<Boolean,Pair<Integer,Integer>> result = isBST2(node);
        if (result.first) {
            System.out.println("Tree is BST");
            System.out.println("Tree min value is :"+result.second.first);
            System.out.println("Tree max value is :"+result.second.second);
        }
        else
            System.out.println("Tree is not BST");

//        if(isBST3(node,Integer.MIN_VALUE,Integer.MAX_VALUE))
//        System.out.println("Tree is BST");
//        else
//        System.out.println("Tree is not BST");


    }


}
