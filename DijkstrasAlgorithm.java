package com.company.GraphTheory;
import java.util.Arrays;
import java.util.Scanner;

public class DijkstrasAlgorithm {

    public static void dijkstra(int [][] adjMatrix){
        int n = adjMatrix.length;
        boolean [] visited = new boolean[n];
        int [] distance = new int[n];
        distance[0] = 0;
        Arrays.fill(distance, 1, distance.length, Integer.MAX_VALUE);
        for(int i=0; i<n-1; i++){
            int minVertex = findMinVertex(visited, distance);
            // mark minimum Vertex as True and Explore the Neighbours
            visited[minVertex] = true;
            for(int j=0; j<n; j++){
                if(adjMatrix[minVertex][j] > 0 && !visited[j] && adjMatrix[minVertex][j] < Integer.MAX_VALUE){
                    // unvisited Neighbour of minVertex
                    // Calculate distance to Reach j from source via MinVertex
                    int newDistance = distance[minVertex] + adjMatrix[minVertex][j];
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    }
                }
            }
        }
        // Printing Distance Values for All Vertices
        for(int i=0; i<n; i++) {
            System.out.println(i + " " + distance[i]);
        }
    }


    private static int findMinVertex(boolean[] visited, int[] distance) {
        int minVertex = -1;
        for(int i=0; i<visited.length; i++){
            if(!visited[i] && (minVertex == -1 || (distance[i] < distance[minVertex]))){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // take Number of Vertices and Edges from the USER
        System.out.print("Enter Number of Vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Edges: ");
        int e = sc.nextInt();
        // Create an Adjacency Matrix of size n*n
        int [][] adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            // take Initial Final and Weight
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjMatrix[v1][v2] = weight;
           // adjMatrix[v2][v1] = weight; // Assuming that Graph is Undirected
        }
        dijkstra(adjMatrix);
    }
}

/*

// OUTPUT

                 Enter Number of Vertices: 8
                 Enter Number of Edges: 16
                      0 2 2
                      2 0 5
                      2 3 4
                      0 3 7
                      6 2 6
                      2 6 3
                      6 3 3
                      0 1 8
                      1 5 16
                      4 5 5
                      7 5 2
                      4 7 8
                      7 6 5
                      6 4 4
                      3 4 9
                      4 0 4
                      
                      0 0
                      1 8
                      2 2
                      3 6
                      4 9
                      5 14
                      6 5
                      7 17

*/

