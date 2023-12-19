import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    boolean isTag = false;
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == '<'){
        isTag = true;
        while(!stack.isEmpty()){
          sb.append(stack.pop());
        }
      }
      if(S.charAt(i) == '>'){
        isTag = false;
        sb.append(S.charAt(i));
        continue;
      }
      if(S.charAt(i) == ' '){
        while(!stack.isEmpty()){
          sb.append(stack.pop());
        }
        sb.append(S.charAt(i));
        continue;
      }

      if(isTag){
        sb.append(S.charAt(i));
      } else {
        stack.push(S.charAt(i));
      }
    }

    while(!stack.isEmpty()){
      sb.append(stack.pop());
    }

    System.out.println(sb.toString());
    sc.close();
  }
}