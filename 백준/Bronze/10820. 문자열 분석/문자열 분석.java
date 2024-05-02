import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    while(sc.hasNextLine()) {
      String N = sc.nextLine();
      
      int lowerCaseCount = 0;
      int upperCaseCount = 0;
      int numberCount = 0;
      int spaceCount = 0;

      for(int i = 0; i < N.length(); i++){
        char letter = N.charAt(i);
        if(letter >= 'a' && letter <= 'z'){
          lowerCaseCount++;
          continue;
        }
        if(letter >= 'A' && letter <= 'Z'){
          upperCaseCount++;
          continue;
        }
        if(letter >= '0' && letter <= '9'){
          numberCount++;
          continue;
        }
        if(letter == ' '){
          spaceCount++;
        }
      }
      
      System.out.println(lowerCaseCount + " " + upperCaseCount + " " + numberCount + " " + spaceCount);
      lowerCaseCount = 0;
      upperCaseCount = 0;
      numberCount = 0;
      spaceCount = 0;
    }

    sc.close();
  }
}