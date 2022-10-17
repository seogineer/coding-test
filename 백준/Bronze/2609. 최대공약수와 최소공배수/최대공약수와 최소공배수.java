import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    int commonDivisor = getGreatestCommomDivisor(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
    System.out.println(commonDivisor);
    System.out.println((Integer.parseInt(input[0]) * Integer.parseInt(input[1])) / commonDivisor);
    sc.close();
  }
  
  private static int getGreatestCommomDivisor(int left, int right){
    for(int i = Math.min(left, right); i > 0; i--){
      if((left % i == 0) && (right % i == 0)){
        return i;
      }
    }
    return 0;
  }
}