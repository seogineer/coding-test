import java.util.*;
class Main {
    static long MOD = 1_000_000_009;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        long[] dp = new long[1_000_001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <= 1_000_000; i++){
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
        }
        for(int tc = 0; tc < T; tc++){
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(dp[n]);
        }
        sc.close();
    }
}