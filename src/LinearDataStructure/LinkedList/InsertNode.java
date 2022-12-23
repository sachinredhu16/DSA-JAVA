package LinearDataStructure.LinkedList;

public class InsertNode<T> {

    // insert before same element
    public Node<T> insertNode(Node<T> node,T n ){
        Node<T> temp1 = node;
        Node<T> temp2 = node.next;
        while(temp2!=null){
            if(temp2.data==n){
                Node<T> n1 = new Node<>(n);
                temp1.next=n1;
                n1.next=temp2;
                break;

            }
            temp1 = temp2;
            temp2 = temp2.next;
        }
        return node;
    }
}
