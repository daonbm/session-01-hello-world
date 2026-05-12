package vn.edu.rikkei.session01.variable;

public class VariableExample {

    public static void main(String[] args) {
        // Java is static typing programming language
        int a;
        a = 3;
//        a = "Tèo"; //error

        String myfullname = "Nguyễn Văn Tèo"; // violate camelCase
        String myFullName = "Nguyễn Văn Tèo"; // flow camelCase

        System.out.println(myFullName);
    }
}
