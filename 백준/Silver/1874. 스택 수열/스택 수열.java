import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();

    StringBuilder sb = new StringBuilder();
    Stack<Integer> stack = new Stack<>();

    int n = 0;
    for(int i = 0; i < tc; i++){
      int input = sc.nextInt();

      if(n < input){
        for(int j = n + 1; j <= input; j++){
          stack.push(j);
          sb.append("+").append("\n");
        }
        n = input;
      } else if(input != stack.peek()){
        System.out.println("NO");
        return;
      }

      stack.pop();
      sb.append("-").append("\n");
    }

    System.out.println(sb);

    return;
  }
}