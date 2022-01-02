# Graphs
A _graph_ is simply a collection of nodes with edges between (some of) them.  <br>
* Graphs can be either directed (like the following graph) or undirected. While directed edges are like a 
one-way street, undirected edges are like a two-way street. <br>
* The graph might consist of multiple isolated subgraphs. <br>
* lf there is a path between every pair of vertices, it is called a "connected graph" <br>
* The graph can also have cycles (or not). An "acyclic graph" is one without cycles. <br>

## Graph Traversals 

The two most common ways to search a graph are _depth-first search(DFS)_ and _breadth-first search(BFS)._ 
* In *depth-first search (DFS)*, we start at the root (or another arbitrarily selected node) and explore each branch completely before moving on to the next branch. That is, we go deep first (hence the name depth first search) before we go wide. 
* In *breadth-first search (BFS)*, we start at the root (or another arbitrarily selected node) and explore each neighbor before going on to any of their children. That is, we go wide (hence breadth-first search) before we go deep.

![dfs-vs-bfs](https://user-images.githubusercontent.com/85002425/147876026-81b5dfe7-6aae-4fd5-9222-30afd43ef7c5.gif)
