import java.util.*;
class Main {
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new long[N + 1];
        System.out.println(calculate(N));
        sc.close();
    }
    static long calculate(int N){
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        if(dp[N] > 0){
            return dp[N];
        }
        dp[N] = calculate(N - 1) + calculate(N - 2);
        return dp[N];
    }
}