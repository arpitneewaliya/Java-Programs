public class StringsInJava {
    public static void main(String[] args) {
        String name = "Thomas Shelby";
        System.out.println(name);


        // a and b point to the same String object
        String a = "Apple";
        String b = "Apple";
        System.out.println("a==b: " + (a == b)); // true
        System.out.println("a.equals(b): " + a.equals(b));
        // c and d point to two different String objects
        String c = new String("Apple");
        String d = new String("Apple");
        System.out.println("c==d: " + (c == d)); // false
        System.out.println("c.equals(d): " + c.equals(d));

        // Pretty printing or formatted string in java
        float n = 234.45134f;
        System.out.printf("Formatted number is %.2f\n", n);
        System.out.printf("Value of PI %.3f\n", Math.PI);
        System.out.printf("Hello my name is %s I am a %s.\n", "Thomas Shelby", "Peaky Blinder");
    }
}
