package Graph;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GetPathBFS {

    public static ArrayList<Integer> getPathBFS(int[][] graph , int start, int end , boolean[] visited){
        ArrayList<Integer> list = new ArrayList<>();
        if (start==end){
            list.add(start);
            visited[start]=true;
            return list;
        }
        visited[start] = true;
        Queue<Integer> queue= new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){

        }
        return list;
    }
}
