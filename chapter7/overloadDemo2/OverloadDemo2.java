package chapter7.overloadDemo2;

public class OverloadDemo2 {
    void test() {
        System.out.println("параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

    void test(double a) {
        System.out.println("double a: " + a);
    }
}
