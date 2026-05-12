package vn.edu.rikkei.session01.variable;

public class PassByValue {

    public static void main(String[] args) {
        // Pass by value: tham trị
        // -> dùng cho kiểu dữ liệu nguyên thủy (Primitive Data Types)
        int a = 3;
        int b = a;
        System.out.println(a); //3
        System.out.println(b); //3

        a = 5;
        System.out.println(a); //5
        System.out.println(b); //3
    }
}
