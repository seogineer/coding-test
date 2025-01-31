import java.util.*;
class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        S = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                S[i][j] = sc.nextInt();
            }
        }
        
        backtrack(0, 0);
        System.out.println(minDiff);
        sc.close();
    }
    
    static void backtrack(int index, int count) {
        if (count == N / 2) {
            int startTeam = 0;
            int linkTeam = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i] && visited[j]) {
                        startTeam += S[i][j];
                    } else if (!visited[i] && !visited[j]) {
                        linkTeam += S[i][j];
                    }
                }
            }
            minDiff = Math.min(minDiff, Math.abs(startTeam - linkTeam));
            return;
        }
        
        if (index >= N) {
            return;
        }
        
        visited[index] = true;
        backtrack(index + 1, count + 1);
        
        visited[index] = false;
        backtrack(index + 1, count);
    }
}