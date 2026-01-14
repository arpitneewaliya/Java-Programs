import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'y';
        while (choice == 'y') {

            System.out.print("x: ");
            int x = input.nextInt();
            System.out.print("y: ");
            int y = input.nextInt();

            System.out.println("Select operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            int operation = input.nextInt();
            switch (operation) {
                case 1:
                    int sum = add(x, y);
                    System.out.println("Sum = " + sum);
                    break;
                case 2:
                    int diff = sub(x, y);
                    System.out.println("Difference = " + diff);
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            System.out.print("Do you want to continue? y/n: ");
            choice = input.next().charAt(0);
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

}

