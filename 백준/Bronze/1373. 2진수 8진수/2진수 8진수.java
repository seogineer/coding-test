import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(binaryToOcta(input));
    sc.close();
  }

  private static String binaryToOcta(String input){
    StringBuilder sb = new StringBuilder();
    for(int i = input.length() - 1; i >= 0; i -= 3){
      int power = 0;
      int temp = 0;
      for(int j = i; j >= (i > 2 ? i - 2 : 0); j--){
        if(input.charAt(j) == '0'){
          power++;
          continue;
        }
        temp += Math.pow(2, power);
        power++;
      }
      sb.insert(0, temp);
    }
    return sb.toString();
  }
}