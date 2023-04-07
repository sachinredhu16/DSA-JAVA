package Graph.Graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B_BFS {

    static public void printBFS(ArrayList<Edge> graph[],boolean[] visited, int start){
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
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        boolean visited[] = new boolean[vertices];
        createGraph(graph);
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
                printBFS(graph,visited,i);
        }

    }

    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

}
