import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tc = sc.nextInt();
    int[] seq = new int[tc];
    int[] dp = new int[tc];
    for(int t = 0; t < tc; t++)
        seq[t] = sc.nextInt();

    for(int i = 0; i < seq.length; i++){
        dp[i] = 1;
        for(int j = 0; j < i; j++){
            if(seq[i] < seq[j] && dp[i] <= dp[j]){
                dp[i] = dp[j] + 1;
            }
        }
    }

    System.out.println(Arrays.stream(dp).max().getAsInt());
      
    sc.close();
  }
}