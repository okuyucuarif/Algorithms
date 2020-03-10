import java.util.Stack;

public class BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                if (s.charAt(i) == '{') {
                    stack.push("}");
                } else if (s.charAt(i) == '(') {
                    stack.push(")");
                } else {
                    stack.push("]");
                }

            } else {
                if (stack.size() == 0) {
                    return "NO";
                }
                String temp = stack.pop();
                if (Character.toString(s.charAt(i)).equals(temp)) {
                    continue;
                } else {
                    return "NO";
                }
            }
        }

        if (stack.size() == 0) {
            return "YES";
        }


        return "NO";
    }

    public static void main(String[] args) {
        String test = "{{[[(())]]}}";
        System.out.println(isBalanced(test));
    }

}
