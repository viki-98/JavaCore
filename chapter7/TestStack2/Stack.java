package chapter7.TestStack2;

public class Stack {
    private int stck[];
    private int tos;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1) System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) System.out.println("Stack is empty");
        else return stck[tos--];
        return 0;
    }
}
