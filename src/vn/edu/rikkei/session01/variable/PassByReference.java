package vn.edu.rikkei.session01.variable;

public class PassByReference {

    public static void main(String[] args) {
        // Pass by reference: tham chiếu
        // -> sử dụng cho kiểu dữ liệu tham chiếu: Reference Data Types
        Student sA = new Student(1, "Alice");
        Student sB = sA;
        System.out.println(sA);
        System.out.println(sB);

        sA.setName("Bob");
        System.out.println(sA);
        System.out.println(sB);
    }
}
