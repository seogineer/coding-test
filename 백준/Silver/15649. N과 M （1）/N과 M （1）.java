import java.util.*;
public class Main {
  static int N;
  static int M;
  static int[] result;
  static boolean[] visit;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    result = new int[M];
    visit = new boolean[N];
    recur(0);
    sc.close();
  }

  static void recur(int depth) {
    if (depth == M) {
      for (int val : result) {
        System.out.print(val + " ");
      }
      System.out.println();
      return;
    }

    for (int n = 0; n < N; n++) {
      if (!visit[n]) {
        visit[n] = true;
        result[depth] = n + 1;
        recur(depth + 1);
        visit[n] = false;
      }
    }
  }
}