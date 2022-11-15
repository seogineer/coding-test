import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        
        dp[0] = arr[0];
        
        for(int i = 1; i < N; i++){
            dp[i] = arr[i];
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(arr[i] + dp[j], dp[i]);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
        sc.close();
    }
}