import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    int answer = 0;
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < input.length(); i++){
      if(input.charAt(i) == '('){
        stack.push(input.charAt(i));
      } else {
        stack.pop();
        if(input.charAt(i - 1) == '('){
          answer += stack.size();
        } else {
          answer += 1;
        }
      }
    }
    System.out.println(answer);
    sc.close();
  }
}