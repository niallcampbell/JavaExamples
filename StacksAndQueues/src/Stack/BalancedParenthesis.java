package Stack;

import java.util.Stack;

public class BalancedParenthesis {
    
    /**
     *  Check if a String of parenthesis are balanced. 
     *  E.g. balanced: {([])}
     *       not balanced: {]{)
     * 
     *  Push {,(,[ on to Stack
     *  If },),] pop from Stack and check if corresponding symbol. 
     * 
     */
    public static boolean balancedParenthesis(String parenthesis){

        char[] chars = parenthesis.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '{' || chars[i] == '(' || chars[i] == '['){
                stack.push(chars[i]);
            } else if(chars[i] == '}' || chars[i] == ')' || chars[i] == ']'){
                char a = stack.pop();
                char b = chars[i];

                if(a == '{' && b != '}'){
                    return false;
                } else if(a == '[' && b != ']'){
                    return false;
                } else if(a == '(' && b != ')'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(balancedParenthesis("{[()]}"));
        System.out.println(balancedParenthesis("{[(]]"));
    }

}
