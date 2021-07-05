/**
 * The Java do-while loop is used to iterate a part of the program several times. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use do-while loop.

    The Java do-while loop is executed at least once because condition is checked after loop body.
 */

package basic;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(String.format("Current Index: %s", i));
            i++;
        } while (i <= 10);
    }
}