package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  public static void createGraph(ArrayList<Graph.Edge> graph[]) {

    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Graph.Edge>();
    }

    graph[0].add(new Graph.Edge(0, 2, 2));

    graph[1].add(new Graph.Edge(1, 2, 3));
    graph[1].add(new Graph.Edge(1, 3, 5));

    graph[2].add(new Graph.Edge(2, 0, 7));
    graph[2].add(new Graph.Edge(2, 1, 6));
    graph[2].add(new Graph.Edge(2, 3, 9));

    graph[3].add(new Graph.Edge(3, 1, 8));
    graph[3].add(new Graph.Edge(3, 2, 9));

  }

  public static void bfs(ArrayList<Graph.Edge> graph[]) {

    boolean[] visited = new boolean[graph.length];

    Queue<Integer> queue = new LinkedList<>();

    queue.add(graph[0].get(0).des);


  }

  public static void main(String[] agr) {
    int V = 7;
    ArrayList<Graph.Edge> graph[] = new ArrayList[V];
    createGraph(graph);
  }
}
