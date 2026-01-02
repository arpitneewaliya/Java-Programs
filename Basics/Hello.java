package Basics;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Fedora!");
        System.out.println("Hello Linux!");

        System.out.print("Hello Fedora!");
        System.out.print("Hello Linux!\n");

        System.out.println(4);
        System.out.println(4+5);
        System.out.println(3 - 5);
        System.out.println(3 * 4);
        System.out.println(4 / 2);

        // We are calling the method of another class inside this class.
        Methods.sayHi();
    }
}
