package chapter7.examples.example2;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        height = width = depth = len;
    }

    double volume() {
        return height * width * depth;
    }
}
