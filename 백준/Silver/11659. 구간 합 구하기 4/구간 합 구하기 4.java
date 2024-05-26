import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] A = new int[n + 1];
    int[] D = new int[n + 1];
    D[1] = 0;
    for(int N = 1; N <= n; N++){
      A[N] = sc.nextInt();
      D[N] = D[N - 1] + A[N];
    }
    for(int M = 0; M < m; M++){
      int i = sc.nextInt();
      int j = sc.nextInt();
      System.out.println(D[j] - D[i - 1]);
    }    
    sc.close();
  }
}