package chapter7.passObRe;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(10, 22);
        System.out.println("ob.a = " + ob.a + " ob.b = " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a = " + ob.a + " ob.b = " + ob.b);
    }
}
