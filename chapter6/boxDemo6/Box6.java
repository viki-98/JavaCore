package chapter6.boxDemo6;

public class Box6 {
    double width, height, depth;

    Box6 () {
        System.out.println("конструктор обьекта Box6");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}
