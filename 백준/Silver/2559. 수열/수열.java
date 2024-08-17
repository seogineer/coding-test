import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] temperature = new int[N];
    for (int n = 0; n < N; n++) {
      temperature[n] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i <= (N - K); i++) {
      int sum = 0;
      for (int j = i; j < (i + K); j++) {
        sum += temperature[j];
      }
      if (max < sum) {
        max = sum;
      }
    }

    System.out.println(max);
    sc.close();
  }
}