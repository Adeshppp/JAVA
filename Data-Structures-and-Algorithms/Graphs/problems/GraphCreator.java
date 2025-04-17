package problems;

import java.util.ArrayList;

public class GraphCreator {
    public static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

        public String toString() {
            return "{" +src +"," + dest +'}';
        }
    }

//    public ArrayList<Edge>[] createGraph() {
//        ArrayList<Edge>[] graph = new ArrayList[7];
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 3));
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 4));
//        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));
//        graph[3].add(new Edge(3, 5));
//        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));
//        graph[4].add(new Edge(4, 5));
//        graph[5].add(new Edge(5, 3));
//        graph[5].add(new Edge(5, 4));
//        graph[5].add(new Edge(5, 6));
//        graph[6].add(new Edge(6, 5));
//
//        return graph;
//    }

    public ArrayList<Edge>[] createGraph(ArrayList<Integer>[] arr) {
        ArrayList<Edge>[] graph = new ArrayList[arr.length];
        for(int i=0;i<arr.length;i++){
            ArrayList<Edge> newEdge = new ArrayList<>();
            for(int j=0;j<arr[i].size();j++){
                Edge edge = new Edge(i,arr[i].get(j));
                newEdge.add(edge);
            }
            graph[i] = newEdge;
        }
        System.out.println("graph is ");
        for(ArrayList<GraphCreator.Edge> list : graph){
            for(int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
            System.out.println();
        }
        System.out.println();
        return graph;
    }
}
