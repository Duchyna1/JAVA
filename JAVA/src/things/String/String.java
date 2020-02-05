package things.String;

import java.util.Scanner;

class length {
    public static void main(String[] args) {
        String txt = "ABCDEFGHINKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
    }
}
class toCase {
    public static void main(String[] args) {
        String txt = "AaAaAa";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }
}
class indexOf {
    public static void main(String[] args) {
        String txt = "ABCDEFGHINKLMNOPQRSTUVWXYZ";
        System.out.println(txt.indexOf("B"));
    }
}
class concat {
    public static void main(String[] args) {
        String txt1 = "First";
        String txt2 = "Second";
        System.out.println(txt1.concat(txt2));
    }
}
class specialCharacters {
    public static void main(String[] args) {
        System.out.println("\\n is New line");
        System.out.println("\\r is Carriage Return");
        System.out.println("\\t is Tab");
        System.out.println("\\b is Backspace");
    }
}
class inoutOutput {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        input = scanner.nextLine();
        System.out.println();
        String[] inputs = input.split(" ", 0);
        int[] numbers = new int[inputs.length];
        for (int i = 0; i<inputs.length; i++){
            numbers[i] = Integer.parseInt(inputs[i]);
        }
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}