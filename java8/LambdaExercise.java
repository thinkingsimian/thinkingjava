package java8;

/**
 * The Lambda expression is used to provide the implementation of an interface which has functional interface.
 * It saves a lot of code. In case of lambda expression,
 * we don't need to define the method again for providing the implementation.
 * Here, we just write the implementation code.
 * Lambda expression provides implementation of functional interface.
 * An interface which has only one abstract method is called functional interface.
 * Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
 */
@FunctionalInterface
interface Greet {
    void greetUser(String message);
}

@FunctionalInterface
interface Message {
    void printMessage(String message);
}

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}

public class LambdaExercise {

    public static void main(String[] args) {

        Greet explain = LambdaExercise::explainClass;
        explain.greetUser("Hello User");

        Message message = System.out::println;

        Addable adder = Integer::sum;
        message.printMessage(String.format("Added Sum: %s", adder.add(10, 10)));
    }

    private static void explainClass(String s) {
        System.out.printf("%s This exercise covers functional interfaces and method references using lambda expressions%n", s);
    }
}
