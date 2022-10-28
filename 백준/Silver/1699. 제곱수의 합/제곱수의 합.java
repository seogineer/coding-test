import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N + 1];
        dp[1] = 1;
        for(int i = 2; i <= N; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= (int)(i / 2); j++){
                if(j * j == i){
                    min = 1;
                    break;
                }
                min = Math.min(min, dp[j] + dp[i - j]);
            }
            dp[i] = min;
        }
        System.out.println(dp[N]);
        sc.close();
    }
}