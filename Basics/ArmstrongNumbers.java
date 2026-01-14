/*
    Print all the 3 digit Armstrong numbers.
    153 -> 1^3 + 5^3 + 3^3 = 153
*/
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int digit;
        for (int i = 100; i <= 999; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                digit = temp % 10;
                sum += digit*digit*digit;
                temp = temp / 10;
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}

