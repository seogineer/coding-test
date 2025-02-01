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
        
        backtrack(0);
        System.out.println(minDiff);
        sc.close();
    }
    
    static void backtrack(int index) {
        if (index == N) {
            List<Integer> teamA = new ArrayList<>();
            List<Integer> teamB = new ArrayList<>();
            
            for (int i = 0; i < N; i++) {
                if (visited[i]) {
                    teamA.add(i);
                } else {
                    teamB.add(i);   
                }
            }
            
            if (teamA.size() == 0 || teamB.size() == 0) {
                return;
            }
            
            int sumA = 0, sumB = 0;
            
            for (int i = 0; i < teamA.size(); i++) {
                for (int j = i + 1; j < teamA.size(); j++) {
                    sumA += S[teamA.get(i)][teamA.get(j)] + S[teamA.get(j)][teamA.get(i)];
                }
            }
            
            for (int i = 0; i < teamB.size(); i++) {
                for (int j = i + 1; j < teamB.size(); j++) {
                    sumB += S[teamB.get(i)][teamB.get(j)] + S[teamB.get(j)][teamB.get(i)];
                }
            }
            
            minDiff = Math.min(minDiff, Math.abs(sumA - sumB));
            return;
        }
        
        visited[index] = true;
        backtrack(index + 1);
        
        visited[index] = false;
        backtrack(index + 1);
    }
}