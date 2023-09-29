public class Shape {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.calcuate();

    }
}

class Rectangle {
    double lenght = 30;
    double width = 35;

    public void calcuate() {
        System.out.println("Rectangle Area = " + (lenght * width));
        System.out.println("********************************");
    }
}

class Triangle extends Rectangle {
    double base = 65;
    double height = 45;

    public void calcuate() {
        super.calcuate();
        System.out.println("Triangle Area = " + (base * height / 2));
    }

}