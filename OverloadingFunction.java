public class OverloadingFunction {
    public static void main(String[] args) {
        printf(10);
        printf(12.342);
        printf("Hello");
        printf(true);
        printf('Z');
    }

    static void printf(int x) {
        System.out.println(x);
    }

    static void printf(double num) {
        System.out.println(num);
    }

    static void printf(String mssg) {
        System.out.println(mssg);
    }

    static void printf(boolean val) {
        System.out.println(val);
    }

    static void printf(char ch) {
        System.out.println(ch);
    }
}

