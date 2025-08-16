package chapter7.overloadDemo1;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.4);
        System.out.println("result = " + result);
    }
}
