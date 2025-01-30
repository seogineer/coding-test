import java.util.*;
class Main {
    static int N;
    static int[][] arr;
    static int max = Integer.MIN_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        arr = new int[N + 1][2];
        
        for (int i = 1; i <= N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        backtrack(1, 0);
        System.out.println(max);
        
        sc.close();
    }
    
    static void backtrack(int day, int pay) {
        if (day > N + 1) {
            return;
        }
        
        max = Math.max(max, pay);
        
        if (day <= N) {
            backtrack(day + arr[day][0], pay + arr[day][1]);
        }
        backtrack(day + 1, pay);
    }
}