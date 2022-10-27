import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];
        int[] dp = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(input[i] > input[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 0; i < dp.length; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
        Stack<Integer> stack = new Stack<>();
        for(int i = input.length - 1; i >= 0; i--){
            if(max == dp[i]){
                stack.push(input[i]);
                max--;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }
}