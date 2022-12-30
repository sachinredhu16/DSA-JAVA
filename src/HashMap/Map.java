package HashMap;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Map<K,V> {

    ArrayList<MapNode<K,V>> bucketArray ;

    int size;
    int numBuckets;

    public Map() {
        numBuckets = 5;
        bucketArray = new ArrayList<>();
        for(int i=0;i<numBuckets;i++)
            bucketArray.add(null);
    }

    private void reHash(){
        ArrayList<MapNode<K,V>> temp = bucketArray;
        bucketArray = new ArrayList<>();
        for(int i=0;i<2*numBuckets;i++)
            bucketArray.add(null);
        numBuckets *=2;
        size=0;
        for(int i=0;i<temp.size();i++){
            MapNode<K,V> head = temp.get(i);
            while(head!=null){
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public double loadFactor(){
        return  (1.0* size)/numBuckets;
    }
    // user defined hashFunction
    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }
    public  void put(K key , V value){
//        System.out.println(" buckets is : "+numBuckets+ " Size is : "+size);
        int index = getBucketIndex(key);
        MapNode<K,V> headNode = bucketArray.get(index);
        while (headNode!=null){
            if(headNode.key.equals(key)){
                headNode.value= value;
                return;
            }

            headNode = headNode.next;
        }
        headNode = bucketArray.get(index);
        MapNode<K,V> newNode = new MapNode<>(key,value);
        newNode.next=headNode;
        bucketArray.set(index,newNode);
        size++;
        if(loadFactor()>0.7){
            reHash();
        }
    }

    public V getValue(K key){
        int index = getBucketIndex(key);
        MapNode<K,V> head = bucketArray.get(index);
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key){
        int index = getBucketIndex(key);
        MapNode<K,V> head = bucketArray.get(index);
        MapNode<K,V> prev = null;
        while(head!=null){
            if(head.key.equals(key)){
                size--;
                if(prev==null)
                    bucketArray.set(index,head.next);
                else{
                    prev.next=head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;

    }
    public void printMap(){
        for(MapNode<K,V> element:bucketArray){
            if(element!=null)
                System.out.println(element.key+" : "+element.value);
        }
    }


    public static void main(String[] args) {
        Map<Integer,String> map = new Map<>();
        for(int i=0;i<15;i++){
            map.put(i+1,"abc");
//            System.out.println(i+1+"-- Load factor is : "+ map.loadFactor());
        }
        map.remove(1);
        map.remove(10);
        map.printMap();

    }

}
