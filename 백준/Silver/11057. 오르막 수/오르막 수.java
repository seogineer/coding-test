import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N + 1][10];
        for(int j = 0; j < 10; j++){
            dp[0][j] = 1;
        }
        
        for(int k = 1; k <= N; k++){
            for(int i = 0; i < 10; i++){
                for(int j = i; j < 10; j++){
                    dp[k][i] += dp[k - 1][j];
                    dp[k][i] %= 10007;
                }
            }
        }
        
        System.out.println(dp[N][0] % 10007);
        sc.close();
    }
}