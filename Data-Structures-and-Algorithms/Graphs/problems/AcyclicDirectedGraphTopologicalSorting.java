package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AcyclicDirectedGraphTopologicalSorting {
    public static void main(String[] args) {
        GraphCreator graphCreator = new GraphCreator();
        ArrayList<Integer> list[] = new ArrayList[]{
                new ArrayList(List.of()),
                new ArrayList(List.of()),
                new ArrayList(List.of(3)),
                new ArrayList(List.of(1)),
                new ArrayList(List.of(0,1)),
                new ArrayList(List.of(0,2)),
        };
        Stack<Integer> stack = new Stack<>();
        ArrayList<GraphCreator.Edge>[] graph = graphCreator.createGraph(list);
        boolean[] visited = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]) topologicalSort(graph, visited, i, stack);
        }
//            stack = topoligcalSort(graph, new boolean[graph.length], 5, stack);
        System.out.print("Topological sort ");
        while(!stack.isEmpty()) System.out.print(stack.pop() +" -> ");;
    }

    private static void topologicalSort(ArrayList<GraphCreator.Edge>[] graph, boolean[] visited, int curr, Stack<Integer> stack) {
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            GraphCreator.Edge edge = graph[curr].get(i);
            if(!visited[edge.dest]){
                topologicalSort(graph,visited,edge.dest,stack);
            }
        }
        stack.push(curr);
    }
}
