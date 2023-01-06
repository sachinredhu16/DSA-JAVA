package Graph;

import java.util.ArrayList;
import java.util.Scanner;

import static Graph.TakeInput.takeInput;

public class AllConnectedComponents {

    private static ArrayList<Integer> allConnectedHelper(int[][] graph, int sv, boolean[] visited, ArrayList<Integer> list) {
        list.add(sv);
        visited[sv] = true;
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            if (graph[sv][i] == 1 && !visited[i]) {
                allConnectedHelper(graph, i, visited,list);
            }
        }
        return list;
    }

    public static ArrayList<ArrayList<Integer>> allConnectedComponents(int[][] graph) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        list.add(allConnectedHelper(graph,0,visited,new ArrayList<>()));
        for (int i=0;i<visited.length;i++){
            if(!visited[i])
                list.add(allConnectedHelper(graph,i,visited,new ArrayList<>()));
        }
        return list;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = takeInput(n, e);
        ArrayList<ArrayList<Integer>> result = allConnectedComponents(graph);

        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                System.out.print(result.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
