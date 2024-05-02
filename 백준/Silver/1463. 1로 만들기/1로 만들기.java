import java.util.*;

public class Main {
  static int minCount = Integer.MAX_VALUE;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    calculate(N, 0);
    System.out.println(minCount);
    sc.close();
  }

  private static void calculate (int X, int count) {
    if(X == 1){
      minCount = Math.min(count, minCount);
      return;
    }
    
    if(minCount < count){
      return;
    }
    
    if(X % 3 == 0){
      calculate(X / 3, count + 1);
    }
    if(X % 2 == 0){
      calculate(X / 2, count + 1);
    }
    calculate(X - 1, count + 1);
  }
}