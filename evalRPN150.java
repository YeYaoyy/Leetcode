import java.util.Stack;

public class evalRPN150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operand = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int y = operand.pop();
                operand.push(operand.pop() + y);
            } else if (tokens[i].equals("-")) {
                int y = operand.pop();
                operand.push(operand.pop() - y);
            } else if (tokens[i].equals("*")) {
                int y = operand.pop();
                operand.push(operand.pop() * y);
            } else if (tokens[i].equals("/")) {
                int y = operand.pop();
                operand.push(operand.pop() / y);
            } else {
                operand.push(Integer.valueOf(tokens[i]));
            }
        }
        return operand.pop();
    }

    public static void main(String[] args) {
        evalRPN150 test = new evalRPN150();
        System.out.println(test.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}
