package ALL.loops;

public class DoWhile {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;
            do {
                System.out.println("Enter 'q' to quit");
                ch = (char) System.in.read();
            } while (ch != 'q');
    }
}
