package LinearDataStructure.LinkedList;

public class MergeTwoSortedList {
    public Node<Integer> merge(Node<Integer> node1,Node<Integer> node2){
        Node<Integer> head =null;
        Node<Integer> tail =null;

        while(node1!=null && node2!=null){
            if(node1.data< node2.data){
                if(head==null){
                   head = node1;
                   tail = node1;
               }
                node1 = node1.next;
                tail.next = node2;
                tail = tail.next;
//                System.out.println(tail.data);


            }
            else{
                if (head==null){
                    head = node2;
                    tail = node2;
                }
                node2 = node2.next;
                tail.next=node1;
                tail= tail.next;
//                System.out.println(tail.data);

            }
        }
//
        return head;
    }
}
