import java.util.LinkedList;

class StackLinkedList<T> {
    LinkedList<T> top;

    StackLinkedList() {
        top = new LinkedList<T>();
    }

    // defining push method
    void push(T data) {
        top.addFirst(data);
    }

    // defining pop method
    T pop() {
        if (top.isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return top.removeFirst();
        }

    }

    // defining peek method
    T peek() {
        if (top.isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return top.getFirst();
        }
    }

    // defining isEmpty method
    boolean isEmpty() {
        return !top.isEmpty() ? true : false;
    }

    // defining method to print stack
    void printStack() {
        if (top.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println(top);
        }
    }
}

class InfixToPostfixDemo {
    // higher value = higher precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    // converts infix expression to postfix
    static String infixToPostfixMethod(String exp) {
        String result = new String("");
        StackLinkedList<Character> s = new StackLinkedList<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            // if its an operand, add to output
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    result += s.pop();
                }
                if (!s.isEmpty() && s.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    s.pop();
                }

            } else {
                while (!s.isEmpty() && precedence(ch) <= precedence(s.peek())) {
                    if (s.peek() == '(') {
                        return "Invalid expression : Quit";
                    }
                    result += s.pop();
                }
                s.push(ch);
            }
        }

        // pop all operators from stack
        while (!s.isEmpty()) {
            result += s.pop();
        }
        return result;
    }
}

public class infixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(InfixToPostfixDemo.infixToPostfixMethod(exp));
    }
}