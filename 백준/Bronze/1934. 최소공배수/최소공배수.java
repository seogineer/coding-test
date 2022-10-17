import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = Integer.parseInt(sc.nextLine());
    for(int t = 0; t < tc; t++){
      String[] input = sc.nextLine().split(" ");
      int gcd = getGreatestCommonDivisor(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
      System.out.println(Integer.parseInt(input[0]) * Integer.parseInt(input[1]) / gcd);
    }
    sc.close();
  }

  private static int getGreatestCommonDivisor(int left, int right){
    for(int i = Math.min(left, right); i > 0; i--){
      if(left % i == 0 && right % i == 0){
        return i;
      }
    }
    return -1;
  }
}