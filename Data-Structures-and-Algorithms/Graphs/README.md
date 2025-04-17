# Graph Representations in Java

This repository demonstrates various ways to represent graphs in Java.

### Types of Graph Representations:
1. **Adjacency List**
2. **Adjacency Matrix**
3. **Edge List**
4. **2D Matrix (Implicit Graph)**

---

## 🔗 Adjacency List Representation

In this approach, we create an adjacency list using an array of size 4 (since the graph contains 4 vertices). Each element in the array holds a list of neighboring vertices.

For example:
- Vertex `0` is connected to vertex `2`, so we store `{0, 2}` at index `0`.
- Vertex `2` is connected to vertices `0`, `1` and `3`, so we store `{2, 0}`, `{2, 1}` and `{2, 3}` at index `2`.

We can implement an adjacency list using:
- A list of lists (`List<List<Integer>>`)
- A HashMap
- Or (as used here) an array of `ArrayList<Integer>`

### Example 1: Undirected and Unweighted Graph

<img width="275" alt="Undirected Unweighted Graph" src="https://github.com/user-attachments/assets/5c24dc7d-7801-461c-a52b-af880875fed5" />

> 🔍 Check the `UndirectedUnWeightedGraph` class for implementation.

---

### Example 2: Undirected and Weighted Graph

<img width="314" alt="Undirected Weighted Graph" src="https://github.com/user-attachments/assets/1063465a-db2e-4e82-b2fb-dbac97ac3f8b" />

> 🔍 Check the `UndirectedWeightedGraph` class for implementation.

---

## 🧮 Adjacency Matrix Representation

<img width="453" alt="Adjacency Matrix" src="https://github.com/user-attachments/assets/3c98f4dd-5207-4b2b-a05f-17275b9c3e48" />

In this representation, we use a 2D matrix to show connections between vertices.

- A `1` at cell `(0, 2)` means there's an edge between vertex `0` and vertex `2`.
- A `0` at cell `(0, 1)` means there's **no edge** between vertex `0` and vertex `1`.
- A `0` at `(1, 1)` indicates there's no self-loop on vertex `1`.
- A `0` at `(3, 0)` means vertex `3` is not connected to vertex `0`.

For **weighted graphs**, instead of using `1` to show a connection, we store the actual weight of the edge. If there’s no edge, we can use `0` or `Integer.MAX_VALUE` (or `-1`, depending on use case).

---

## 📊 Adjacency List vs. Adjacency Matrix

| Criteria              | Adjacency List                               | Adjacency Matrix            |
|-----------------------|----------------------------------------------|-----------------------------|
| **Space Complexity**  | O(V + E)                                     | O(V²)                       |
| **Efficient For**     | Sparse Graphs                                | Dense Graphs                |
| **Edge Lookup Time**  | O(V) (needs traversal)                       | O(1)                        |
| **Insert/Delete Edge**| O(1)                                | O(1)                        |
| **Insert/Delete Vertex** | O(V)                                         | O(V²)                       |

> Adjacency List is more space-efficient for sparse graphs because it only stores connected neighbors, whereas the adjacency matrix stores all possible connections, including non-existent ones.


---

## 🧾 Edge List Representation

In this representation, we simply list all the edges of the graph. For example, if we have the following connections:

```java
Edges = {{0,2}, {1,2}, {1,3}, {2,3}}
```

There are 4 edges, so our edge list size is 4.

We can implement the edge list using:
- `ArrayList`
- `LinkedList`

In this repository, we use an **`ArrayList`** to represent the edge list.

> Edge List is especially useful in algorithms that require sorting edges, such as **Minimum Spanning Tree (MST)** algorithms (e.g., Kruskal's algorithm).

---

## 🧱 2D Matrix (Implicit Graph)

An **implicit graph** is a logical graph that is represented using a 2D matrix.

This type of graph is **not explicitly stored** as edges or adjacency lists — instead, a 2D grid is treated like a graph where each cell is a vertex, and neighboring cells represent edges.

### Example use cases:
- Shortest Path in a Maze
- Flood Fill Algorithm (like in Paint)
- Island Counting Problems

```text
0 1 0
1 0 1
0 1 0
```

In most problems, you're expected to traverse the matrix as a graph.

> We’ve seen several graph representations, but **Adjacency List** is most commonly used due to its space and time efficiency.

---

# 🔁 Graph Traversals

To process or explore all nodes in a graph, we use **graph traversal algorithms**.

### Types of Graph Traversals:
1. **Breadth-First Search (BFS)**
2. **Depth-First Search (DFS)**

Graphs allow us to choose **any vertex** as the starting point for traversal.

<img width="618" alt="Graph Traversal Example" src="https://github.com/user-attachments/assets/ca7937cc-1a99-4d7e-bfb4-05e8c7b59995" />

---

## 🌐 Breadth-First Search (BFS)

**BFS** explores the graph level by level. It visits all **immediate neighbors** before moving on to their neighbors.

### Example:
Starting from vertex `0`, the traversal order will be:

```
Level 0: 0  
Level 1: 1, 2  
Level 2: 3, 4  
Level 3: 5  
Level 4: 6  
```

### How it works:
- Start at a vertex (e.g., `0`)
- Visit and enqueue all unvisited neighbors
- Dequeue the next vertex and repeat

> Think of it like **level-order traversal** in binary trees.

---

### 🧪 BFS Algorithm (Single Connected Component)

```java
public static void bfs(ArrayList<Edge>[] graph, int v){
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[v];
    queue.add(0);
    while(!queue.isEmpty()){
        int curr = queue.remove();
        if (!visited[curr]) {
            System.out.print(curr + " ");
            visited[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge edge = graph[curr].get(i);
                queue.add(edge.dest);
            }
        }
    }
}
```

### 🔀 BFS on Disconnected Graph

![Image](https://github.com/user-attachments/assets/a7e2097b-7a83-4be3-b636-4d79a6dbac83)

```java
package graphTraversal.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOnGraphWithDisconnectedComponents {

    public static class Edge {
        int src;
        int dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[0].add(new Edge(0, 4));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static void bfs(ArrayList<Edge>[] graph, int v, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int curr = queue.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge edge = graph[curr].get(i);
                    queue.add(edge.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfs(graph, v, visited, i);
            }
        }

        System.out.println();
    }
}
```

### 🧮 Time Complexity:
```
O(V + E)
V = Number of vertices  
E = Number of edges
```

---

## 🔍 Depth First Search (DFS)

DFS explores **as deep as possible** along each branch before backtracking — similar to a pre-order traversal of a tree.

### DFS Algorithm (Recursive):

```java
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!visited[edge.dest]) {
                dfs(graph, edge.dest, visited);
            }
        }
    }
```
---

Problem : All paths from source to target : check `AllPathsFromSourceToDestination` class

<img width="955" alt="Image" src="https://github.com/user-attachments/assets/384f87df-4347-46b7-94eb-551b1ac340d0" />

Problem : Cycle detection in directed graph : check `CycleDetectionInDirectedGraph` class

<img width="842" alt="Image" src="https://github.com/user-attachments/assets/d7e1c132-fcb5-4937-b3e6-9a8591dde74f" />


Problem : Topological Sorting

we can implement topological sorting on acyclic directed graphs(ADG) only.
ADG are directed graph with no cycles.

check `AcyclicDirectedGraphTopologicalSorting` class

Problem : Cycle in Graph

We can detect cycles in undirected graph by using
1. DFS
2. BFS
3. DSU (Disjoint Set Union)

We can detect cycles in directed graph by using
1. DFS
2. BFS
3. Topological sorting using Kahn's Algorithm
4. 
