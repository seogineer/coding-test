import java.util.*;

public class Main {
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sb.append((int) Math.pow(2, N) - 1).append('\n');
    hanoi(1, 3, N);
    System.out.println(sb.toString());
    sc.close();
  }

  public static void hanoi(int a, int b, int n) {
    if(n == 1){
      sb.append(a + " " + b).append('\n');
      return;
    }
    hanoi(a, 6 - a - b, n - 1);
    sb.append(a + " " + b).append('\n');
    hanoi(6 - a - b, b, n - 1);
  }
}