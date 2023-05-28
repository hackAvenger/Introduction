package Graphs;

import java.util.ArrayList;

public class Graph {
  public static void createGraph(ArrayList<Edge> graph[]) {

    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0, 2, 2));

    graph[1].add(new Edge(1, 2, 3));
    graph[1].add(new Edge(1, 3, 5));

    graph[2].add(new Edge(2, 0, 7));
    graph[2].add(new Edge(2, 1, 6));
    graph[2].add(new Edge(2, 3, 9));

    graph[3].add(new Edge(3, 1, 8));
    graph[3].add(new Edge(3, 2, 9));

  }

  public static void main(String[] agr) {
    int V = 4;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);

    //print 2's node
    for (int i = 0; i < graph[2].size(); i++) {
      Edge edge = graph[2].get(i);
      System.out.println(edge.des + " " + edge.wt);
    }
  }


  static class Edge {
    int src;
    int des;

    int wt;

    public Edge(int src, int des, int w) {
      this.src = src;
      this.des = des;
      this.wt = w;
    }
  }
}
