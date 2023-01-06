package Graph;

public class PrintDFS {
    private static void printHelper(int[][] graph,int sv,boolean[] visited){
        System.out.print(sv+" ");
        visited[sv] = true;
        int n = graph.length;
        for(int i=0;i<n;i++){
            if(graph[sv][i]==1 && !visited[i]){
                printHelper(graph,i,visited);
            }
        }
    }
    public static void printDFS(int[][] graph){
        boolean[] visited = new boolean[graph.length];
        System.out.println("====== Printing DFS ======");
        for(int i=0;i<graph.length;i++) {
            if(!visited[i])
                printHelper(graph, i, visited);
        }
    }
}
