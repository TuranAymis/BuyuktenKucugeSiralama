import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value1;
        int value2;
        int value3;

        System.out.print("1. değeri giriniz: ");
        value1 = scan.nextInt();
        System.out.print("2. değeri giriniz: ");
        value2 = scan.nextInt();
        System.out.print("3. değeri giriniz: ");
        value3 = scan.nextInt();

        if (value1 > value2 && value1 > value3) {
            if (value2 > value3) {
                System.out.println(value1 + ">" + value2 + ">" + value3);
            } else {
                System.out.println(value1 + ">" + value3 + ">" + value2);
            }
        } else if (value2 > value1 && value2 > value3) {
            if (value1 > value3) {
                System.out.println(value2 + ">" + value1 + ">" + value3);
            } else {
                System.out.println(value2 + ">" + value3 + ">" + value1);
            }
        } else {
            if (value1 > value2) {
                System.out.println(value3 + ">" + value1 + ">" + value2);
            } else {
                System.out.println(value3 + ">" + value2 + ">" + value1);
            }
        }
    }
}