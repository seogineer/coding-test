import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    long[][] rs = new long[n + 1][n + 1];
    
    for (int i = 1; i <= n; i++) {
      Arrays.fill(rs[i], Integer.MAX_VALUE);
      rs[i][i] = 0;
    }
    
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      rs[a][b] = Math.min(rs[a][b], c);
    }
    
    for (int k = 1; k < n + 1; k++) {
      for (int j = 1; j < n + 1; j++) {
        for (int i = 1; i < n + 1; i++) {
         if (rs[j][i] > rs[j][k] + rs[k][i]) {
           rs[j][i] = rs[j][k] + rs[k][i];
         }
        }
      }
    }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        if (rs[i][j] >= Integer.MAX_VALUE) {
          System.out.print(0 + " ");
        } else {
          System.out.print(rs[i][j] + " ");
        }
      }
      System.out.println();
    }
    
    sc.close();
  }
}