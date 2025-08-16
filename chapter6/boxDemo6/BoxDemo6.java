package chapter6.boxDemo6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();

        double vol;

        vol = myBox1.volume();
        System.out.println("обьем равен " + vol);

        vol = myBox2.volume();
        System.out.println("обьем равен " + vol);

    }
}
