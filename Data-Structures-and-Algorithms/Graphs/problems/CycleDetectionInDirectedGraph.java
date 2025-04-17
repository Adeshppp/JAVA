package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleDetectionInDirectedGraph {
    public static void main(String[] args) {
        GraphCreator graphCreator = new GraphCreator();

//        ArrayList<Integer>[] arr = new ArrayList[]{
//                new ArrayList<>(Arrays.asList(2)),
//                new ArrayList<>(Arrays.asList(0)),
//                new ArrayList<>(Arrays.asList(3)),
////                new ArrayList<>(Arrays.asList(0))
//                new ArrayList<>()
//        };
        ArrayList<Integer>[] arr = new ArrayList[]{
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(4)),
                new ArrayList<>(Arrays.asList(2))
        };

        ArrayList<GraphCreator.Edge>[] graph = graphCreator.createGraph(arr);
        boolean[] visited = new boolean[graph.length];
        boolean[] recursionStack = new boolean[graph.length];
        int nodeToCheck = 4;
        boolean isCycle = isCycleExist(graph, visited, nodeToCheck, recursionStack);
        System.out.println(isCycle);
    }

    private static boolean isCycleExist(ArrayList<GraphCreator.Edge>[] graph, boolean[] visited, int curr, boolean[] recursionStack) {
        visited[curr] = true;
        recursionStack[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            GraphCreator.Edge edge = graph[curr].get(i);
            if(recursionStack[edge.dest]) return true;
            else if((!visited[edge.dest]) && isCycleExist(graph,visited, edge.dest, recursionStack)) return true;
        }
        recursionStack[curr] = false;
        return false;
    }

}
