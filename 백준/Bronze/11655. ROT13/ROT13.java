import java.util.*;
class Main {
  private static Queue<Character> lowerCaseQueue = new LinkedList<>();
  private static Queue<Character> upperCaseQueue = new LinkedList<>();
  
  public static void main(String[] args) {
    initLowerCaseQueue(lowerCaseQueue);
    initUpperCaseQueue(upperCaseQueue);
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < input.length(); i++){
      if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
        sb.append(encrypt(lowerCaseQueue, input.charAt(i)));
        continue;
      }
      if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
        sb.append(encrypt(upperCaseQueue, input.charAt(i)));
        continue;
      }
      sb.append(input.charAt(i));
    }
    System.out.println(sb);
    sc.close();
  }
  
  private static char encrypt(Queue<Character> queue, char letter){
    while(true){
      if(queue.peek() != letter){
        queue.offer(queue.poll());
        continue;
      }
      break;
    }
    for(int i = 0; i < 13; i++){
      queue.offer(queue.poll());
    }
    return queue.peek();
  }

  private static void initUpperCaseQueue(Queue<Character> upperCaseQueue){
    for(char c = 'A'; c <= 'Z'; c++){
      upperCaseQueue.offer(c);
    }
  }
  
  private static void initLowerCaseQueue(Queue<Character> lowerCaseQueue){
    for(char c = 'a'; c <= 'z'; c++){
      lowerCaseQueue.offer(c);
    }
  }
}