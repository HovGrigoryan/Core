package chapter6;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return height * width * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


//     void volume(){
//         System.out.print("value equal is ");
//         System.out.println(width * height * depth);
//     }

}
