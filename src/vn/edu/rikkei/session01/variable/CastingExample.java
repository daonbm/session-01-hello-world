package vn.edu.rikkei.session01.variable;

public class CastingExample {

    public static void main(String[] args) {
        // Implicit Casting: smaller -> larger
        int a = 3;
        double b = a; // 3.0
        System.out.println(a); //3
        System.out.println(b); //3.0

        // Explicit Casting: larger -> smaller
        double c = 5.5;
        int d = (int) c;
        System.out.println(c); //5.5
        System.out.println(d); //5
    }
}
