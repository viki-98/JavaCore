package chapter6.boxDemo7;

import javax.swing.*;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(5, 12, 9);

        double vol;

        vol = myBox1.volume();
        System.out.println("обьем равен " + vol);

        vol = myBox2.volume();
        System.out.println("обьем равен " + vol);
    }
}
