package pri.damai._3_栈;

import java.util.Stack;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/14 16:54
 * just do it.
 */
public class _20_有效的括号 {

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.pop()!= '(') return false;
                if (c == '}' && stack.pop()!= '{') return false;
                if (c == ']' && stack.pop()!= '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean valid = isValid("]");
        System.out.println(valid);
    }

}
