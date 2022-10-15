import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = Integer.parseInt(sc.nextLine());
    for(int t = 0; t < tc; t++){
      if(isValidParenthesisString(sc.nextLine())){
        System.out.println("YES");
        continue;
      }
      System.out.println("NO");
    }
  }

  private static boolean isValidParenthesisString(String input){
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < input.length(); i++){
      if(input.charAt(i) == '('){
        stack.push(input.charAt(i));
        continue;
      }
      if(input.charAt(i) == ')' && !stack.isEmpty()){
        stack.pop();
        continue;
      }
      if(input.charAt(i) == ')' && stack.isEmpty()){
        return false;
      }
    }
    
    if(stack.isEmpty()){
      return true;
    }
    return false;
  }
}