package Queue;

public class QueueLinkedList {
    static Node<Integer> front;
    static Node<Integer> rear;
    static int size =0;

    public static void print(){
        Node<Integer> temp = front;
        while(temp!=null){
            System.out.println("Element is : "+temp.data);
            temp = temp.next;
        }
    }

    public static void enqueue(int element){
      Node<Integer> node = new Node<>(element);
      if(front==null ) {
          front = node;
          rear = node;
          size++;
          return;
      }

      rear.next = node ;
      rear = rear.next;
      size++;
    }
    public static void dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty !");
            return;
        }
        front = front.next;
        if(size==1)
            rear= null;
        size--;


    }

    static public boolean isEmpty(){
//        return size==0;
        return front==null;
    }

    public static void main(String[] args) {
        enqueue(10);
        dequeue();
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);



        System.out.println("size is :"+size);
        print();



    }
}
