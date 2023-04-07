package Graph.Graph1;

import java.util.ArrayList;

import static Graph.Graph1.Graph.createGraph;

public class C_DFS {
    public static void printDFS(ArrayList<Graph.Edge>[] graph,boolean[] visited,int start){
        if(visited[start])
            return;
        visited[start] = true;
        System.out.print(start+" ");
        for(int i=0;i<graph[start].size();i++){
            printDFS(graph,visited,graph[start].get(i).dest);
        }
    }
    public static void main(String[] args) {
        int vertices = 7;

        ArrayList<Graph.Edge>[] graph = new ArrayList[vertices];
        boolean visited[] = new boolean[vertices];
        createGraph(graph);
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
                printDFS(graph,visited,i);
        }
    }
}
