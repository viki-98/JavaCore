package chapter7.passOb;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        if (a == o.a && b == o.b) {
            return true;
        } else {
            return false;
        }
    }
}
