import java.util.*;

class Edge implements Comparable<Edge>{
  int to;
  int weight;
  
  public Edge(int to, int weight) {
    this.to = to;
    this.weight = weight;
  }

  @Override
  public int compareTo(Edge other) {
    return Integer.compare(this.weight, other.weight);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int V = sc.nextInt();
    int E = sc.nextInt();

    List<ArrayList<Edge>> edges = new ArrayList<>();
    for (int v = 0; v <= V; v++) {
      edges.add(new ArrayList<Edge>());
    }
    boolean[] visit = new boolean[V + 1];

    for (int e = 1; e <= E; e++) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      edges.get(A).add(new Edge(B, C));
      edges.get(B).add(new Edge(A, C));
    }

    PriorityQueue<Edge> pq = new PriorityQueue<>();
    pq.add(new Edge(1, 0));

    int mstWeight = 0;
    
    while (!pq.isEmpty()) {
      Edge current = pq.poll();

      if (visit[current.to]) {
        continue;
      }

      visit[current.to] = true;
      mstWeight += current.weight;

      for (Edge edge : edges.get(current.to)) {
        if (!visit[edge.to]) {
          pq.add(edge);
        }
      }
    }

    System.out.println(mstWeight);
    sc.close();
  }
}