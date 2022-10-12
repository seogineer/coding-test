import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int tc = Integer.parseInt(sc.nextLine());
    int[] input = new int[tc];
    for(int i = 0; i < tc; i++){
      input[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < tc; i++){
      while(!stack.isEmpty() && input[stack.peek()] < input[i]){
        input[stack.pop()] = input[i];
      }
      
      stack.push(i);
    }

    while(!stack.isEmpty()){
      input[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for(int el : input){
       sb.append(el).append(' ');
    }

    System.out.println(sb);
  }
}