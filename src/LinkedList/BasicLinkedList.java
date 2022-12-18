package LinkedList;

import java.util.Scanner;

public class BasicLinkedList {

    public static <T> void pringLinkedList(Node<T> node){
        Node<T> temp = node;  // storing reference of first node (head) for future use
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public static <T> void printUsingRecursion(Node<T> node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        node = node.next;
        printUsingRecursion(node);

    }

    public static  Node<Integer> giveLinkedList(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = new Node<>();
        Node<Integer> tail =new Node<>();

        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> node = new Node<>(data);
            if(head.data==null) {
                head = node;
                tail = node;
            }
            else {
                tail.next = node;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }


    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(50);
        Node<Integer> node4 = new Node<>(70);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node<Integer> item1 = new Node<>(20);
        item1.next = null;
//        Node<Integer> item2 = new Node<>(40);
//        Node<Integer> item3 = new Node<>(60);
//        Node<Integer> item4 = new Node<>(80);

//        item1.next = item2;
//        item2.next = item3;
//        item3.next = item4;

//        System.out.println(node2);
//        System.out.println(node1.next);

        // Integer Linked List
//        pringLinkedList(node1);
//        System.out.println();
//        printUsingRecursion(node1);
//        System.out.println();


        Node<String> n1 = new Node<>("My");
        Node<String> n2 = new Node<>("Name");
        Node<String> n3 = new Node<>("is");
        Node<String> n4 = new Node<>("Sangeet");

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        // String Linked List
//        pringLinkedList(n1);
//        System.out.println();
//        printUsingRecursion(n1);

          // taking input of Linked List
//        Node<Integer> node = giveLinkedList();
//        pringLinkedList(node);


        // Insert Node before same element
//        InsertNode<Integer> insert = new InsertNode<>();
//        pringLinkedList(node1);
//        System.out.println();
//        Node<Integer> result = insert.insertNode(node1,30);
//        pringLinkedList(result);


        // find mid point
//        MidPoint mid = new MidPoint();
//        System.out.println("Mid point is : "+mid.findMidPoint(node1));

        // sort two linked list
        MergeTwoSortedList mer = new MergeTwoSortedList();
        Node<Integer> res = mer.merge(node1,item1);
        pringLinkedList(res);


    }
}
