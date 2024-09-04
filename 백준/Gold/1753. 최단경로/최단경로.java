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
        int start = sc.nextInt();

        List<Edge>[] edges = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            edges[i] = new ArrayList<>();
        }

        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            edges[u].add(new Edge(v, w));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            if (dist[current.to] < current.weight) {
                continue;
            }

            for (Edge edge : edges[current.to]) {
                int nextTo = edge.to;
                int nextWeight = edge.weight + dist[current.to];

                if (dist[nextTo] > nextWeight) {
                    dist[nextTo] = nextWeight;
                    pq.add(new Edge(nextTo, nextWeight));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
        
        sc.close();
    }
}
