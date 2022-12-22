package Tree;

public class PrintTree {
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
}
