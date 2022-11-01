import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[][] dp = new long[K][N + 1];
        for(int n = 0; n <= N; n++){
            dp[0][n] = 1;
        }
        for(int k = 0; k < K; k++){
            dp[k][0] = 1;
        }

        for(int i = 1; i < K; i++){
            for(int j = 1; j <= N; j++){
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000000;
            }
        }

        System.out.println(dp[K - 1][N]);
        sc.close();
    }
}