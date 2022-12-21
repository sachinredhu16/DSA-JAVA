package Tree;

import java.util.Scanner;

public class firstTree {
    static Scanner sc = new Scanner(System.in);
    public static TreeNode<Integer> takeInput(){
        System.out.println("Enter the value of root");
        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter the number of children for : "+n);
        int children = sc.nextInt();

        for (int i=0;i<children;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void printTree(TreeNode<Integer> root){

        String s = root.data+":";
        int children = root.children.size();
        for(int i=0;i<children;i++){
            s +=root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<children;i++){
           printTree(root.children.get(i));
        }

    }
    public static void main(String[] args) {

        TreeNode<Integer> root = new TreeNode<>(10);
        TreeNode<Integer> node1 = new TreeNode<>(20);
        TreeNode<Integer> node2 = new TreeNode<>(30);
        TreeNode<Integer> node3 = new TreeNode<>(40);
        TreeNode<Integer> node4 = new TreeNode<>(50);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node1.children.add(node4);


        TreeNode<Integer> root1 = takeInput();
        printTree(root1);
    }
}
