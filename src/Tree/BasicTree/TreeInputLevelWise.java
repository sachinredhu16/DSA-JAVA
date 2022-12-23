package Tree.BasicTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeInputLevelWise {


    public static TreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of root");
        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode<Integer> node = queue.remove();
            System.out.println("Enter number of children of "+node.data);
            int children = sc.nextInt();
            for(int i=0;i<children;i++){
                System.out.println("Enter "+(i+1)+" element of "+node.data);
                TreeNode<Integer> child = new TreeNode<Integer>(sc.nextInt());
                node.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }



}
