package vn.edu.rikkei.session01.operator;

public class MathOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = a / 2;
        int c = a % 2;
        System.out.println(b); // 2
        System.out.println(c); // 1

        int d = 3;
        d += 2; // d = d + 2
        System.out.println(d); // 5
        d = d + 2;
        System.out.println(d); // 7

        boolean isEvenNumber = 4 % 2 == 0;
        System.out.println(isEvenNumber); // true

        int e = 4;
        if (e % 2 == 0 && d > 0) {
            System.out.printf("%d is even number\n", e);
        } else {
            System.out.printf("%d is NOT even number\n", e);
        }

        boolean f = !(5 % 2 == 0); // true
        System.out.println(f);

        String result = 4 > 2 ? "is larger than 2" : "is NOT larger than 2";
        System.out.println(result);
    }
}
