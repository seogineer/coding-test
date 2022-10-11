import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();
    boolean flag = true;
    for(int i = 0; i < input.length(); i++){
      if(input.charAt(i) == ' '){
        while(!stack.isEmpty()){
          sb.append(stack.pop());
        }
        sb.append(" ");
        continue;
      }
      if(input.charAt(i) == '<'){
        while(!stack.isEmpty()){
          sb.append(stack.pop());
        }
        flag = false;
        sb.append("<");
        continue;
      }
      if(input.charAt(i) == '>'){
        flag = true;
        sb.append(">");
        continue;
      }
      if(flag){
        stack.push(input.charAt(i) + "");
      } else {
        sb.append(input.charAt(i) + "");
      }
    }
    
    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }

    System.out.println(sb);
  }
}