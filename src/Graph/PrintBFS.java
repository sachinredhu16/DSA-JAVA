package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static Graph.PrintDFS.printDFS;
import static Graph.TakeInput.takeInput;

public class PrintBFS {

    private static void printBFSHelper(int[][] graph , int sv,boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sv);
        visited[sv] = true;
        while(!queue.isEmpty()){
            int out = queue.remove();
            System.out.print(out+" ");
            for(int i=0;i<graph.length;i++){
                if(graph[out][i]==1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void printBFS(int[][] graph ){
        boolean[] visited = new boolean[graph.length];
        System.out.println("====== Printing BFS ======");
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                printBFSHelper(graph,i,visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = takeInput(n,e);

        printBFS(graph);
        System.out.println();
        printDFS(graph);
    }
}
