import java.util.*;
class Main {
  public static void main(String[] args) {
    Map<Character, Integer> alphabetFrequency = new HashMap<>();
    for(int i = 97; i < 123; i++){
      alphabetFrequency.put((char) i, 0);
    }
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    for(int i = 0; i < input.length(); i++){
      alphabetFrequency.put(input.charAt(i), alphabetFrequency.get(input.charAt(i)) + 1);
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 97; i < 123; i++){
      sb.append(alphabetFrequency.get((char) i) + " ");
    }

    System.out.println(sb);
  }
}