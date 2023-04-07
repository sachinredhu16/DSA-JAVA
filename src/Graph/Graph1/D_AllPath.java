package Graph.Graph1;

import java.util.ArrayList;

import static Graph.Graph1.Graph.createGraph;

public class D_AllPath {

    public static void printAllPathDFS(ArrayList<Graph.Edge>[] graph,boolean[] visited,int start,int target,String path){
        if(start==target){
            System.out.println(path);
            return;
        }
        if(visited[start])
            return;
        visited[start] = true;
        for(int i=0;i<graph[start].size();i++){
            int e = graph[start].get(i).dest;
            printAllPathDFS(graph,visited,e,target,path+e);

        }
        visited[start] = false;

    }

    public static void main(String[] args) {
        int vertices = 7;

        ArrayList<Graph.Edge>[] graph = new ArrayList[vertices];
        boolean visited[] = new boolean[vertices];
        createGraph(graph);
        printAllPathDFS(graph,visited,0,5,"0");
    }
}
