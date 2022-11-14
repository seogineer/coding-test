import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] table = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            table[i] = sc.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[1] = table[1];
        if(n > 1){
            dp[2] = table[1] + table[2];    
        }
        for(int i = 3; i <= n; i++){
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + table[i], dp[i - 3] + table[i - 1] + table[i]));
        }

        System.out.println(dp[n]);
        sc.close();
    }
}