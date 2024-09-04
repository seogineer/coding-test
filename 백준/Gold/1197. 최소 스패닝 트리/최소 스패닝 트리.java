import java.util.*;
public class Main {
    static class Edge implements Comparable<Edge> {
        int to;
        int weight;

        public Edge (int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        List<Edge>[] edges = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            edges[u].add(new Edge(v, weight));
            edges[v].add(new Edge(u, weight));
        }

        boolean[] visited = new boolean[V + 1];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        
        pq.add(new Edge(1, 0));

        int mstWeight = 0;
        
        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            if (visited[current.to]) {
                continue;
            }
            
            visited[current.to] = true;
            mstWeight += current.weight;
            
            for (Edge edge : edges[current.to]) {
                if (!visited[edge.to]) {
                    pq.add(edge);
                }
            }
        }

        System.out.println(mstWeight);
        sc.close();
    }
}
