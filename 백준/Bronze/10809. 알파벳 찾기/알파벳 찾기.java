import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    int[] count = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    for(int i = 0; i < S.length(); i++){
      if(count[S.charAt(i) - 97] == -1){
        count[S.charAt(i) - 97] = i;
      }
    }

    for(int i = 0; i < count.length; i++){
      System.out.print(count[i] + " ");
    }
    sc.close();
  }
}