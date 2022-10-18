import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(octaToBinary(input));
    sc.close();
  }

  private static String octaToBinary(String input){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < input.length(); i++){
      int number = input.charAt(i) - '0';
      sb.append(number / 2 / 2).append(number / 2 % 2).append(number % 2);
    }
    while(sb.charAt(0) == '0' && sb.length() > 1){
      sb.deleteCharAt(0);
    }
    return sb.toString();
  }
}