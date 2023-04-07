package Graph.Graph1;

import java.util.ArrayList;

public class A_AdjacencyList {
    static class Edge{
        int src;
        int dist;
        int weight;
        public Edge(int src,int dist,int weight) {
            this.src = src;
            this.dist = dist;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++)
            graph[i] = new ArrayList<Edge>();

        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        createGraph(graph);

        System.out.println("Printing neighbours : "+2);
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dist+" "+e.weight);
        }
    }
}
