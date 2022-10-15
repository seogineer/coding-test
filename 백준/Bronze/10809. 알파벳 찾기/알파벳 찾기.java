import java.util.*;
class Main {
  public static void main(String[] args) {
    Map<Character, Integer> alphabetLocation = new HashMap<>();
    for(int i = 97; i < 123; i++){
      alphabetLocation.put((char) i, -1);
    }

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    for(int i = 0; i < input.length(); i++){
      if(alphabetLocation.get(input.charAt(i)) == -1){
        alphabetLocation.put(input.charAt(i), i);
      }
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 97; i < 123; i++){
      sb.append(alphabetLocation.get((char) i)).append(" ");
    }

    System.out.println(sb);
  }
}