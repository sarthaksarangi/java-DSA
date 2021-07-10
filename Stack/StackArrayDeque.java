import java.util.ArrayDeque;
//Time Complexity = Big O(1)
public class StackArrayDeque {
    public static void main(String[] args) {
        //Stack <Integer> stack = new Stack<>():
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(30);
        s.push(50) ;
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
