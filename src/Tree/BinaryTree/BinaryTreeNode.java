package Tree.BinaryTree;

import com.sun.source.tree.BinaryTree;

public class BinaryTreeNode<T> {

    public T data ;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
