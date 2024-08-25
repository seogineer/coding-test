import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge> {
        int to, weight;

        public Edge(int to, int weight) {
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
        
        int V = sc.nextInt(); // 정점의 수
        int E = sc.nextInt(); // 간선의 수
        int start = sc.nextInt(); // 시작 정점
        
        // 인접 리스트를 사용하여 그래프를 표현
        List<Edge>[] adj = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            adj[u].add(new Edge(v, weight));
        }
        
        // 다익스트라 알고리즘을 사용하여 최단 경로 계산
        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));
        
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currentVertex = current.to;
            int currentWeight = current.weight;
            
            if (currentWeight > dist[currentVertex]) {
                continue;
            }
            
            for (Edge edge : adj[currentVertex]) {
                int nextVertex = edge.to;
                int newDist = dist[currentVertex] + edge.weight;
                
                if (newDist < dist[nextVertex]) {
                    dist[nextVertex] = newDist;
                    pq.add(new Edge(nextVertex, newDist));
                }
            }
        }
        
        // 출력
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
