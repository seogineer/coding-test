import java.util.*;

public class Main {
  static long C;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    C = sc.nextLong();
    System.out.println(pow(A, B));
    sc.close();
  }

  public static long pow(long a, long b) {
    if(b == 1){
      return a % C;
    }
    long temp = pow(a, b / 2);
    if(b % 2 == 1){
      return ((temp * temp % C) * a) % C;
    }
    return temp * temp % C;
  }
}