import java.util.*;
class Main {
    static int minCost = Integer.MAX_VALUE;
    static int N;
    static int[][] arr;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        arr = new int[N][N];
        visited = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        visited[0] = true;
        backtrack(0, 0, 0, 1);
        
        System.out.println(minCost);
        sc.close();
    }
    
    static void backtrack(int start, int current, int cost, int depth) {
        if (depth == N) {
            if (arr[current][start] != 0) {
                minCost = Math.min(cost + arr[current][start], minCost);   
            }
            return;
        }
        
        for (int next = 0; next < N; next++) {
            if (!visited[next] && arr[current][next] != 0) {
                visited[next] = true;
                backtrack(start, next, cost + arr[current][next], depth + 1);
                visited[next] = false;
            }
        }
    }
}