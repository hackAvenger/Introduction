package GreedyAlgo;

import java.lang.*;

class DijkstraAlgo {
  static final int n = 6;

  int min_dist(int[] distance, Boolean[] visited) {
    int min = Integer.MAX_VALUE, min_index = -1;
    for (int v = 0; v < n; v++)
      if (!visited[v] && distance[v] <= min) {
        min = distance[v];
        min_index = v;
      }
    return min_index;
  }
  void printSolution(int[] distance) {
    System.out.println("Vertex      Distance from Source");
    for (int i = 0; i < DijkstraAlgo.n; i++)
      System.out.println(((char) (i + 65)) + " \t\t \t" + distance[i]);
  }
  void dijkstra(int[][] graph, int source) {
    int[] distance = new int[n];
    Boolean[] visited = new Boolean[n];
    for (int i = 0; i < n; i++) {
      distance[i] = Integer.MAX_VALUE;
      visited[i] = false;
    }
    distance[source] = 0;
    for (int count = 0; count < n - 1; count++) {
      int u = min_dist(distance, visited);
      visited[u] = true;
      for (int v = 0; v < n; v++)
        if (!visited[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v])
          distance[v] = distance[u] + graph[u][v];
    }
    printSolution(distance);
  }

  public static void main(String[] args) {
    int[][] graph = new int[][] {{0, 4, 5, 0, 0, 0}, {4, 0, 11, 9, 7, 0}, {5, 11, 0, 0, 3, 0},
        {0, 9, 0, 0, 13, 2}, {0, 7, 3, 13, 0, 6}, {0, 0, 0, 2, 6, 0}};
    DijkstraAlgo t = new DijkstraAlgo();
    int src = 0;
    t.dijkstra(graph, src);
  }
}

