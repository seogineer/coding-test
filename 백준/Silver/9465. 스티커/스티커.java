import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc < T; tc++){
            int n = sc.nextInt();
            int[][] desk = new int[2][n + 1];
            int[][] dp = new int[2][n + 1];

            for(int i = 0; i < 2; i++){
                for(int j = 1; j <= n; j++){
                    desk[i][j] = sc.nextInt();
                }
            }
            dp[0][1] = desk[0][1];
            dp[1][1] = desk[1][1];
            for(int i = 2; i <= n; i++){
                dp[0][i] = desk[0][i] + Math.max(dp[1][i - 1], dp[1][i - 2]);
                dp[1][i] = desk[1][i] + Math.max(dp[0][i - 1], dp[0][i - 2]);
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
        sc.close();
    }
}