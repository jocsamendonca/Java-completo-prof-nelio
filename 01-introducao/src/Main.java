import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seu nome");

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();

        sc.close();

        System.out.println("Voce digitou: " + str);
    }
}
