package chapter6.boxDemo7;

public class Box7 {
    double width, height, depth;

    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}
