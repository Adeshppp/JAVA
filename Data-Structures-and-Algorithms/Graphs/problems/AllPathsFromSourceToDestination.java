package problems;


import java.util.ArrayList;
import java.util.Arrays;

// All paths from source to target
public class AllPathsFromSourceToDestination {
    public static void main(String[] args) {

//        GraphCreator graphCreator = new GraphCreator();
//        ArrayList<GraphCreator.Edge>[] graph = graphCreator.createGraph();
//        boolean[] visited = new boolean[graph.length];
//        int source = 0;
//        int dest = 6;
//        printAllPaths(graph, visited,source,dest, "0");

        GraphCreator graphCreator = new GraphCreator();
        ArrayList<Integer>[] arr = new ArrayList[]{
                new ArrayList<>(Arrays.asList(1,2)),
                new ArrayList<>(Arrays.asList(0,3)),
                new ArrayList<>(Arrays.asList(0,4)),
                new ArrayList<>(Arrays.asList(1,4,5)),
                new ArrayList<>(Arrays.asList(2,3,5)),
                new ArrayList<>(Arrays.asList(3,4,6)),
                new ArrayList<>(Arrays.asList(5))
        };
        ArrayList<GraphCreator.Edge>[] graph = graphCreator.createGraph(arr);
        boolean[] visited = new boolean[graph.length];
        int source = 0;
        int dest = 6;
        printAllPaths(graph, visited,source,dest, "0");

    }


    public static void printAllPaths(ArrayList<GraphCreator.Edge>[] graph, boolean[] visited, int curr, int dest, String path){
       if(curr == dest){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            GraphCreator.Edge edge = graph[curr].get(i);
            if(!visited[edge.dest]){
                visited[curr] = true;
                printAllPaths(graph, visited, edge.dest,dest,path+edge.dest);
                visited[curr]=false;
            }
        }

    }

}
