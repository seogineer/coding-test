import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] price = new int[N + 1][3];
    for(int i = 1; i < price.length; i++){
      for(int j = 0; j < price[0].length; j++){
        price[i][j] = sc.nextInt();
      }
    }
    int[][] dp = new int[N + 1][3];
    dp[1][0] = price[1][0];
    dp[1][1] = price[1][1];
    dp[1][2] = price[1][2];
    for(int i = 2; i < price.length; i++){
      dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + price[i][0];
      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + price[i][1];
      dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + price[i][2];
    }
    System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
    sc.close();
  }
}