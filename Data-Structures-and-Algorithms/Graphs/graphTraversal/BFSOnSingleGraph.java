package graphTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOnSingleGraph {

    public  static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));

    }

    public static void bfs(ArrayList<Edge>[] graph, int v){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        queue.add(0);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if (visited[curr] == false) {
                // print the node
                System.out.print(curr+" ");
                // mark it as a visited
                visited[curr] = true;
                // add neighbours to queue
                for(int i=0;i<graph[curr].size();i++){
                    Edge edge = graph[curr].get(i);
                    queue.add(edge.dest);
                }

            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph, v);
        System.out.println();
    }
}
