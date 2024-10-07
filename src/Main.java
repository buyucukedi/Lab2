import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 variables:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Adder adder = new Adder();
        System.out.println(adder.add(a,b));
        Substractor substractor = new Substractor();
        System.out.println(substractor.substract(a,b));

    }
}
