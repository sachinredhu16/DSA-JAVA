package Graph;

import java.util.Scanner;

import static Graph.TakeInput.takeInput;

public class IsConnected {

    private static void isConnectedHelper(int[][] graph, int sv, boolean[] visited) {
        visited[sv] = true;
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            if (graph[sv][i] == 1 && !visited[i]) {
                isConnectedHelper(graph, i, visited);
            }
        }
    }

    public static Boolean isConnected(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        isConnectedHelper(graph, 0, visited);
        boolean isConnected = true;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i])
                isConnected = false;
        }
        return isConnected;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = takeInput(n, e);
        if (isConnected(graph))
            System.out.println("Graph is Connected !");
        else
            System.out.println("Grapgh is not Connected !");
    }
}
