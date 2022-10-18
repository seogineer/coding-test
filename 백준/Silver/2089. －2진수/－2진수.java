import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println(toBinary(input));
    sc.close();
  }

  private static String toBinary(int input){
    StringBuilder sb = new StringBuilder();
    
    if(input == 0){
      sb.append("0");
      return sb.toString();
    }

    while(input != 1){
      sb.insert(0, Math.abs(input % -2));
      input = (int) Math.ceil((double) input / -2);
    }

    sb.insert(0, input);

    return sb.toString();
  }
}