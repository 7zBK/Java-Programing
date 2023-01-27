import java.util.Scanner;

public class Ex22 {
        public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("Input frist nubmer:");
        int number = scan.nextInt();
        for (int i = 1; i <= 12; i++){
            System.out.println(number+ " x " +i+ " = "+number*i);
        }
    }
}