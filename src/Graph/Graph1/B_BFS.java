package Graph.Graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Graph.Graph1.Graph.createGraph;

public class B_BFS {

    static public void printBFS(ArrayList<Graph.Edge> graph[], boolean[] visited, int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int rem = queue.remove();
            if(!visited[rem]){
                System.out.print(rem+" ");
                visited[rem] = true;
                for(int i=0;i<graph[rem].size();i++){
                    int num = graph[rem].get(i).dest;
                    if(!queue.contains(num))
                        queue.add(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 7;

        ArrayList<Graph.Edge>[] graph = new ArrayList[vertices];
        boolean visited[] = new boolean[vertices];
        createGraph(graph);
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
                printBFS(graph,visited,i);
        }

    }

}
