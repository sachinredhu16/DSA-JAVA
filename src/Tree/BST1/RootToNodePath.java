package Tree.BST1;

import Tree.BinaryTree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

import static Tree.BinaryTree.TakeInputLevelWise.takeInputLevelWise;

public class RootToNodePath {

    public static List<Integer> rootToNode(BinaryTreeNode<Integer> node , int num){
        if(node==null)
            return null;

        if(node.data==num){
            List<Integer> list = new ArrayList<>();
            list.add(num);
            return list;
        }

        List<Integer> list ;
        if(node.data>num)
            list= rootToNode(node.left,num);
        else
            list= rootToNode(node.right,num);

        if(!list.isEmpty())
            list.add(node.data);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = rootToNode(takeInputLevelWise(),5);


        for (int element:list){
            System.out.print(element+" ");
        }
    }
}
