# Graphs
A _graph_ is simply a collection of nodes with edges between (some of) them.  <br>
* Graphs can be either directed (like the following graph) or undirected. While directed edges are like a 
one-way street, undirected edges are like a two-way street. <br>
* The graph might consist of multiple isolated subgraphs. <br>
* lf there is a path between every pair of vertices, it is called a "connected graph" <br>
* The graph can also have cycles (or not). An "acyclic graph" is one without cycles. <br>

### Graph Traversals 
The two most common ways to search a graph are _depth-first search(DFS)_ and _breadth-first search(BFS)._ 
* In *depth-first search (DFS)*, we start at the root (or another arbitrarily selected node) and explore each branch completely before moving on to the next branch. That is, we go deep first (hence the name depth first search) before we go wide. 
* In *breadth-first search (BFS)*, we start at the root (or another arbitrarily selected node) and explore each neighbor before going on to any of their children. That is, we go wide (hence breadth-first search) before we go deep.

![dfs-vs-bfs](https://user-images.githubusercontent.com/85002425/147876026-81b5dfe7-6aae-4fd5-9222-30afd43ef7c5.gif)


### Kruskal's Algorithm
* Kruskal's algorithm finds a *minimum spanning forest* of an undirected edge-weighted graph. 
* If the graph is connected, it finds a *minimum spanning tree.* (A minimum spanning tree of a connected graph is a subset of the edges that forms a tree that includes every vertex, where the sum of the weights of all the edges in the tree is minimized.
* For a disconnected graph, a *minimum spanning forest* is composed of a minimum spanning tree for each connected component.
* It is a *greedy algorithm* in graph theory as in each step it adds the next lowest-weight edge that will not form a cycle to the minimum spanning forest.

![kruskals](https://user-images.githubusercontent.com/85002425/147876375-622147ba-55da-44f7-96f0-f71424bd71d3.gif)


#### Bellman-Ford Algorithm
* The *Bellman–Ford algorithm* is an algorithm that computes shortest paths from a single source vertex to all of the other vertices in a weighted digraph. 
* Although it is slower than Dijkstra's, it is more versatile, as it is capable of handling graphs in which some of the edge weights are
  negative numbers

![Bellman-Ford](https://user-images.githubusercontent.com/85002425/147877047-6479281a-139f-4785-81e4-598123843183.gif)

#### Floyd-Warshall Algorithm
* *Floyd-Warshall Algorithm* is an algorithm for finding the shortest paths in a weighted graph with positive or negative edge weights, but
  no negative cycles
* A single execution of the algorithm will find the lengths (summed weights) of the shortest paths between *all* pairs of nodes

![Floyd_warshall_gif](https://user-images.githubusercontent.com/85002425/147877110-26494d4e-92fc-4091-b80e-d6aca70b8dae.gif)


#### Prim's Algorithm
* Prim's algorithm (also known as Jarník's algorithm) is a greedy algorithm that finds a minimum spanning tree for a weighted undirected graph. 
* This means it finds a subset of the edges that forms a tree that includes every vertex, where the total weight of all the edges in the tree is minimized. 
* The algorithm operates by building this tree one vertex at a time, from an arbitrary starting vertex, at each step adding the cheapest possible connection from the tree to another vertex.

![Prim's Algo](https://user-images.githubusercontent.com/85002425/147876733-a19815c0-47a8-4df6-acc6-4a38e237a7f1.gif)

#### Dijkstra's Algorithm
* Dijkstra’s algorithm is very similar to Prim’s algorithm for minimum spanning tree. Like Prim’s MST, we generate a SPT (shortest path tree) with a given source as a root.
* We maintain two sets, one set contains vertices included in the shortest-path tree, other set includes vertices not yet included in the shortest-path tree.
* At every step of the algorithm, we find a vertex that is in the other set (set of not yet included) and has a minimum distance from the source.
* Dijkstra’s algorithm is used to find the shortest path from a single source vertex to all other vertices in the given graph. 

![dijkstra](https://user-images.githubusercontent.com/85002425/147876617-f2d5cc6c-0e16-468b-a0e5-e500b31b46eb.gif)









