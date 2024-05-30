public class Logical {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 20;
        
        // AND OPERATOR
        System.out.println((a > b) && (b > c));
        
        // OR OPERATOR
        System.out.println((a > b) || (b > c));
        
        // NOT OPERATOR
        System.out.println(!(a > b));

        // TERNARY OPERATOR
        System.out.println((a > b) ? "a is greater" : "b is greater");

        // COMPARISON OPERATOR
        System.out.println((a > b) == (b > c));

        // EQUALS OPERATOR
        System.out.println((a == b) || (b == c));

        // NOT EQUALS OPERATOR
        System.out.println((a != b) && (b != c));
        
    }
}
