package LinearDataStructure.Stack;

import java.util.Stack;

public class balancedParenthesis {

    public static void main(String[] args) {
        String s = "))";
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            if(s.charAt(i)==')' && stack.peek()=='(')
                stack.pop();
            if(s.charAt(i)==']' && stack.peek()=='[')
                stack.pop();
            if(s.charAt(i)=='}' && stack.peek()=='{')
                stack.pop();

        }
        if(stack.isEmpty())
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Not Balanced");

    }
}
