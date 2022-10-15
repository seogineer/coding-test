import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    String[] suffix = new String[input.length()];
    for(int i = 0; i < input.length(); i++){
      suffix[i] = input.substring(i, input.length());
    }
    Arrays.sort(suffix);
    
    for(String el : suffix){
      System.out.println(el);
    }
    sc.close();
  }
}