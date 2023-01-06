package Graph;

import java.util.Scanner;

import static Graph.TakeInput.takeInput;

public class HasPath {

    public static boolean hasPath(int[][] graph,int start,int end,boolean[] visited){
        if(start==end)
            return true;
        visited[start] = true;
        boolean b = false;
        for(int i=0;i<graph.length;i++){
            if(graph[start][i]==1 && !visited[i]){
                b = hasPath(graph, i, end, visited);
                if(b)
                    break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = takeInput(n,e);
        if(hasPath(graph,0,3,new boolean[graph.length])){
            System.out.println("Path exist !");
        }
        else
            System.out.println("Path not found !");
    }
}
