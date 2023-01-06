package Graph;

import java.util.ArrayList;
import java.util.Scanner;

import static Graph.TakeInput.takeInput;

public class GetPathDFS {

    public static ArrayList<Integer> getPathDFS(int[][] graph, int start,int end ,boolean[] visited){
        if(start==end){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(start);
            visited[start]=true;
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        visited[start]=true;
        for (int i=0;i<graph.length;i++){
            if(graph[start][i]==1 && !visited[i]){
                list = getPathDFS(graph,i,end,visited);
                if(!list.isEmpty()) {
                    list.add(start);
                    break;
                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = takeInput(n,e);

        ArrayList<Integer> result = getPathDFS(graph,0,3,new boolean[graph.length]);

        if(!result.isEmpty()){
            for (int element:result){
                System.out.print(element+" ");
            }
        }
        else
            System.out.println("No Path exist");
    }
}
