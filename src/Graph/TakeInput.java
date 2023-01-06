package Graph;

import java.util.Scanner;

import static Graph.PrintDFS.printDFS;

public class TakeInput {
    // using adjacency matrix
    public static int[][] takeInput(int n,int e){
        int[][] graph = new int[n][n];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<e;i++){
           int firstVertex = sc.nextInt();
           int secondVertex = sc.nextInt();
           graph[firstVertex][secondVertex] = 1;
           graph[secondVertex][firstVertex] = 1;
        }
        return graph;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        printDFS(takeInput(n,e));

    }
}
