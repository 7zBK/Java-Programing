import java.util.Scanner;

import javax.xml.stream.events.StartDocument;
public class Ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number :");
        int x = scan.nextInt();
        int y = (x*x)+(2*x)+10;
        System.out.print(y);
    }
}