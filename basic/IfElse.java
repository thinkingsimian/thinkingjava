//The Java if statement tests the condition. It executes the if block if condition is true.

package basic;

public class IfElse {
    public static void main(String[] args) {
        Double flag = Math.abs(Math.random() * 1000);
        Double check = 500.00;
        System.out.println((flag > check) ? String.format("Value greater than %s: %s", check, flag)
                : String.format("Value less than %s: %s", check, flag));
    }
}
