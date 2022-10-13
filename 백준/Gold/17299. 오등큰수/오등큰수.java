import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = Integer.parseInt(sc.nextLine());
    int[] input = new int[tc];
    Map<Integer, Integer> count = new HashMap<>();
    for(int t = 0; t < tc; t++){
      input[t] = sc.nextInt();
      count.put(input[t], 0);
    }

    for(int t = 0; t < tc; t++){
      count.put(input[t], count.get(input[t]) + 1);
    }

    Stack<Integer> stack = new Stack<>();
    for(int t = 0; t < tc; t++){
      while(!stack.isEmpty() && count.get(input[stack.peek()]) < count.get(input[t])){
        input[stack.pop()] = input[t];
      }
      stack.push(t);
    }

    while(!stack.isEmpty()){
      input[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < input.length; i++){
      sb.append(input[i]).append(' ');
    }

    System.out.println(sb);
  }
}