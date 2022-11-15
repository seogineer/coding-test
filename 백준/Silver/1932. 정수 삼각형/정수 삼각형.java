import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = sc.nextInt();
            }
        }

        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = Math.max(dp[i][j] + dp[i - 1][j], dp[i][j] + dp[i - 1][j - 1]);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            max = Math.max(dp[n][i], max);
        }
        System.out.println(max);
        sc.close();
    }
}