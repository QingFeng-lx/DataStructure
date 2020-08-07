package com.qingfeng.stack.practice;


@SuppressWarnings("all")
public class CalculatorTest {
    public static void main(String[] args) {
        String expression = "35+2-1*3";
        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operStack = new ArrayStack(10);
        Calculator calcu = new Calculator();

        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int result = 0;
        char ch = ' ';
        String keepNum = "";
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (calcu.isOper(ch)) {
                if (!operStack.isEmpty()) {
                    if (calcu.priority(ch) <= calcu.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        result = calcu.calculate(num1, num2, oper);
                        numStack.push(result);
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);
                    }

                } else {
                    operStack.push(ch);
                }
            } else {
                keepNum += ch;

                if (index == expression.length() - 1) {
                    numStack.push(Integer.valueOf(keepNum));
                } else {
                    if (calcu.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.valueOf(keepNum));
                    }
                }
            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            result = calcu.calculate(num1, num2, oper);
            numStack.push(result);

        }
        System.out.printf("the value of expression is:%s=%d", expression, result);
    }
}
