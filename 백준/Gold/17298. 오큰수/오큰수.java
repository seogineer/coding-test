import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] sequence = new int[N];
    for(int i = 0; i < sequence.length; i++){
      sequence[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < sequence.length; i++){
      while(!stack.isEmpty() && sequence[stack.peek()] < sequence[i]){
        sequence[stack.pop()] = sequence[i];
      }
      stack.push(i);
    }

    while(!stack.isEmpty()){
      sequence[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < sequence.length; i++){
      sb.append(sequence[i]).append(' ');
    }
    System.out.println(sb.toString());
    
    sc.close();
  }
}