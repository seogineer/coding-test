import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int answer = 1;
    for(int i = input; i > 0; i--){
      answer *= i;
    }
    System.out.println(answer);
  }
}