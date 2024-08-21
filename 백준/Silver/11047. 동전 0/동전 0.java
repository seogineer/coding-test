import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for (int n = N - 1; n >= 0; n--) {
      count += K / arr[n];
      K %= arr[n];
    }
    System.out.println(count);
    sc.close();
  }
}