package LinearDataStructure.Stack;



public class StackLinkedList {
    static Node<Integer> head ;
    static int size =0;

    public static void push(int element){

        Node<Integer> node = new Node<>(element);
        node.next = head;
        head = node;
        size++;

    }

    public static void pop(){
        head = head.next;
        size--;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        System.out.println(size);

        pop();
        printLinkedList(head);

        System.out.println(size);

    }

    public static <T> void printLinkedList(Node<T> node){
        Node<T> temp = node;  // storing reference of first node (head) for future use
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}
