package LinearDataStructure.LinkedList;

public class MidPoint {

        public int findMidPoint(Node<Integer> node){
            int count=0;
            Node<Integer> temp = node;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count/2;
        }
}
