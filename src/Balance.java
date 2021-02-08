import java.util.Stack;

public class Balance {
    public static void main(String[] args) {
        String example = "[(])";
        System.out.println("Is " +  example + " balanced? "  + isBalanced(example));
        example = "()[]{}";
        System.out.println("Is " +  example + " balanced? " + isBalanced(example));
        example = "()";
        System.out.println("Is " +  example + " balanced? " + isBalanced(example));
    }

    public static boolean isBalanced(String example) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < example.length(); i++) {

            char currentElement = example.charAt(i);

            if (currentElement == '(' || currentElement == '[' || currentElement == '{') {
                stack.push(currentElement);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char prevElement = stack.pop();
            if (currentElement == ')' && (prevElement == '{' || prevElement == '[')) {
                return false;
            }else if (currentElement == ']' && (prevElement == '{' || prevElement == '(')) {
                return false;
            }else if (currentElement == '}' && (prevElement == '[' || prevElement == '(')){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
