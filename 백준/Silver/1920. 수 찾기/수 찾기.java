import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int n = 0; n < N; n++) {
      A[n] = sc.nextInt();
    }
    
    Arrays.sort(A);
    
    int M = sc.nextInt();
    int[] targets = new int[M];
    for (int m = 0; m < M; m++) {
      targets[m] = sc.nextInt();
    }

    for (int i = 0; i < M; i++) {
      int target = targets[i];
      int start = 0;
      int end = N - 1;
      while (true) {
        if (start == end) {
          if (A[start] == target) {
            System.out.println(1);
          } else {
            System.out.println(0);
          }
          break;
        }
        int mid = (start + end) / 2;
        if (A[mid] < target) {
          start = mid + 1;
        } else {
          end = mid;
        }
      }
    }
    
    sc.close();
  }
}