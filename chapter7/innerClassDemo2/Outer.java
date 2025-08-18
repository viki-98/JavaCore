package chapter7.innerClassDemo2;

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;

        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }

    void showy() {
//        System.out.println(y);
    }
}
