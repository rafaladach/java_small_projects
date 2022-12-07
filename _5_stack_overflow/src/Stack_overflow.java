import java.util.Enumeration;

public class Stack_overflow {
    public static void main(String[] args) {

        Stack_overflow funny = new Stack_overflow();
        int fun = funny.fun(2);

        System.out.println("liczby: " + fun);
    }

    int fun(int number) {
        if(number > 0) {
            return number + fun(number-1);
        } else {
            return 0;
        }
    }

}
