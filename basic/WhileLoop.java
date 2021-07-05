//The Java while loop is used to iterate a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop.
package basic;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(String.format("Current Index: %s", i));
            i++;
        }
    }
}
