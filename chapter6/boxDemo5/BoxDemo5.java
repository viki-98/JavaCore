package chapter6.boxDemo5;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();
        double vol;

        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox1.volume();
        System.out.println("обьем равен " + vol);

        vol = myBox2.volume();
        System.out.println("обьем равен " + vol);
    }
}
