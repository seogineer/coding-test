import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int countFive = fiveMultipler(n) - fiveMultipler(n - m) - fiveMultipler(m);
    int countTwo = twoMultipler(n) - twoMultipler(n - m) - twoMultipler(m);
    System.out.println(Math.min(countFive, countTwo));
    sc.close();
  }

  private static int fiveMultipler(int number){
    int count = 0;
    while(number >= 5){
      count = count + (number / 5);
      number = number / 5;
    }
    return count;
  }

  private static int twoMultipler(int number){
    int count = 0;
    while(number >= 2){
      count = count + (number / 2);
      number = number / 2;
    }
    return count;
  }
}