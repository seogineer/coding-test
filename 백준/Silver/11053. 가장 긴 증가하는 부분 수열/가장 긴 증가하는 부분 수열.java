import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for(int tc = 0; tc < T; tc++){
            arr[tc] = sc.nextInt();
        }
        int[] dp = new int[T];
        for(int i = 0; i < T; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for(int d : dp){
            max = Math.max(max, d);
        }
        System.out.println(max);
        sc.close();
    }
}