import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stairCount = sc.nextInt();
    int[] stair = new int[stairCount + 1];
    for(int i = 0; i < stairCount; i++) {
      stair[i] = sc.nextInt();
    }
    
    int[][] dp = new int[stairCount + 1][2];
    dp[0][0] = stair[0];
    dp[1][0] = stair[1];
    dp[0][1] = 0;
    dp[1][1] = stair[0] + stair[1];
    for(int i = 2; i <= stairCount; i++){
      dp[i][0] = Math.max(dp[i - 2][0], dp[i - 2][1]) + stair[i];
      dp[i][1] = dp[i - 1][0] + stair[i];
    }

    System.out.println(Math.max(dp[stairCount - 1][0], dp[stairCount - 1][1]));
    sc.close();
  }
}